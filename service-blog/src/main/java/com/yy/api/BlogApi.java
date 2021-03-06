package com.yy.api;

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
public class BlogApi {

    @Autowired(required = false)
    private BlogService blogService;

    @GetMapping("/blogs")
    public PageBean getBlogBeanByPage(BlogBean blogBean,PageBean<BlogBean> pageBean,String orderBy,boolean isDesc){

        return blogService.getBlogByPage(blogBean, pageBean, orderBy, isDesc);
    }

}
