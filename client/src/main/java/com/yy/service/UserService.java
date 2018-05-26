package com.yy.service;

import com.yy.pojo.ResultMessage;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by jiangyao on 2018/5/25.
 */
@FeignClient(value = "service-user")
public interface UserService {

    @PostMapping("/login")
    ResultMessage login(@RequestParam("uId") String uId, @RequestParam("uPassword") String uPassword);

    @GetMapping("/token")
    ResultMessage getUserByToken(@RequestParam("uToken") String uToken);

}
