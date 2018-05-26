package com.yy.controller;

import com.yy.pojo.ResultMessage;
import com.yy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * Created by jiangyao on 2018/5/25.
 */
@RestController
public class UserController {

    @Autowired(required = false)
    private UserService userService;

    @PostMapping("/login")
    public ResultMessage login(@RequestParam String uId, @RequestParam String uPassword) {
        return ResultMessage.ok(userService.login(uId, uPassword));
    }

    @GetMapping("/tokenUser/{token}")
    public ResultMessage getUserInfo(@PathVariable("token") String _token) {

        return ResultMessage.ok(userService.getUserByToken(_token));
    }

}
