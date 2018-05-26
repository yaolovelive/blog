package com.yy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by jiangyao on 2018/5/24.
 */
@Controller
public class ViewController {

    @GetMapping({"/","index.html"})
    public String toIndex(){

        return "index";
    }

    @GetMapping("/login.html")
    public String toLogin(){

        return "login";
    }

}
