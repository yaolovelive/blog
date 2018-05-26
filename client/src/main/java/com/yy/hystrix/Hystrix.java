package com.yy.hystrix;

import com.yy.pojo.BlogBean;
import com.yy.pojo.PageBean;
import com.yy.service.BlogService;
import org.springframework.stereotype.Component;

/**
 * Created by jiangyao on 2018/5/26.
 */
@Component
public class Hystrix implements BlogService {
    @Override
    public PageBean<BlogBean> getBlogBeanByPage(BlogBean blogBean, PageBean<BlogBean> pageBean, String orderBy, boolean isDesc) {
        return null;
    }
}
