package com.yy.service;

import com.yy.hystrix.Hystrix;
import com.yy.pojo.BlogBean;
import com.yy.pojo.PageBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by jiangyao on 2018/5/26.
 */
@FeignClient(value = "service-blog",fallback = Hystrix.class)
public interface BlogService {

    @GetMapping("/blogs")
    PageBean<BlogBean> getBlogBeanByPage(@RequestParam("blogBean") BlogBean blogBean,@RequestParam("pageBean") PageBean<BlogBean> pageBean,@RequestParam("orderBy") String orderBy,@RequestParam("isDesc") boolean isDesc);

}
