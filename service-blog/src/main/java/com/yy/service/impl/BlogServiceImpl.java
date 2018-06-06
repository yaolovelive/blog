package com.yy.service.impl;

import com.yy.mapper.BlogMapper;
import com.yy.pojo.BlogBean;
import com.yy.pojo.PageBean;
import com.yy.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jiangyao on 2018/5/26.
 */
@Service("blogService")
public class BlogServiceImpl implements BlogService {

    @Autowired(required = false)
    private BlogMapper blogMapper;

    @Override
    public Integer getBlogCount(BlogBean blogBean) {

        return blogMapper.getBlogCount(blogBean);
    }

    @Override
    public PageBean getBlogByPage(BlogBean blogBean, PageBean<BlogBean> pageBean, String orderBy, boolean isDesc) {
        Integer offset = (pageBean.getPageNo() - 1) * pageBean.getPageSize();
        List<BlogBean> blogBeans = blogMapper.getBlogByPage(blogBean, offset, pageBean.getPageSize(), orderBy, isDesc);
        pageBean.setDataCount(getBlogCount(blogBean));
        pageBean.setList(blogBeans);
        return pageBean;
    }
}
