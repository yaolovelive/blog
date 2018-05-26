package com.yy.api;

import com.yy.pojo.ResultMessage;
import com.yy.pojo.UserBean;
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
    public UserBean login(@RequestParam(required = true) String uId, @RequestParam(required = true) String uPassword){

        return userService.login(uId, uPassword);
    }

    @GetMapping("/token")
    public UserBean loginByToken(@RequestParam String uToken){

        return userService.getUserByToken(uToken);
    }

}
