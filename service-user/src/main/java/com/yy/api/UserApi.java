package com.yy.api;

import com.yy.pojo.ResultMessage;
import com.yy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserApi {

    @Autowired(required = false)
    private UserService userService;

    @PostMapping("/login")
    public ResultMessage login(@RequestParam(required = true) String uId, @RequestParam(required = true) String uPassword){

        return ResultMessage.ok(userService.login(uId, uPassword));
    }

    @GetMapping("/token")
    public ResultMessage loginByToken(@RequestParam String uToken){

        return ResultMessage.ok(userService.getUserByToken(uToken));
    }

}
