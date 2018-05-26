package com.yy.controller;

import com.yy.pojo.BlogBean;
import com.yy.pojo.PageBean;
import com.yy.pojo.ResultMessage;
import com.yy.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jiangyao on 2018/5/26.
 */
@RestController
public class BlogController {

    @Autowired(required = false)
    private BlogService blogService;


    @GetMapping("/test")
    public ResultMessage test(){
        PageBean<BlogBean> pageBean = new PageBean<>();
        return ResultMessage.ok(blogService.getBlogBeanByPage(new BlogBean(),pageBean,"",false));
    }

}
