package com.yy.service;

import com.yy.hystrix.Hystrix;
import com.yy.pojo.UserBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by jiangyao on 2018/5/25.
 */
@FeignClient(value = "service-user",fallback = Hystrix.class)
public interface UserService {

    @PostMapping("/login")
    UserBean login(@RequestParam("uId") String uId, @RequestParam("uPassword") String uPassword);

    @GetMapping("/token")
    UserBean getUserByToken(@RequestParam("uToken") String uToken);

}
