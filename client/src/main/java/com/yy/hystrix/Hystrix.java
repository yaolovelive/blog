package com.yy.hystrix;

import com.yy.pojo.BlogBean;
import com.yy.pojo.PageBean;
import com.yy.pojo.UserBean;
import com.yy.service.BlogService;
import com.yy.service.UserService;
import org.springframework.stereotype.Component;

/**
 * Created by jiangyao on 2018/5/26.
 */
@Component
public class Hystrix implements BlogService,UserService {
    @Override
    public PageBean<BlogBean> getBlogBeanByPage(BlogBean blogBean, PageBean<BlogBean> pageBean, String orderBy, boolean isDesc) {
        return null;
    }

    @Override
    public UserBean login(String uId, String uPassword) {
        return null;
    }

    @Override
    public UserBean getUserByToken(String uToken) {
        return null;
    }
}
