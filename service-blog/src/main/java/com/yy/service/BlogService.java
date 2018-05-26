package com.yy.service;

import com.yy.pojo.BlogBean;
import com.yy.pojo.PageBean;

/**
 * Created by jiangyao on 2018/5/26.
 */
public interface BlogService {

    String ORDERBY_ID = "b_id";
    String ORDERBY_CREATE_DATE = "b_create_date";
    String ORDERBY_VIEW_COUNT = "b_view_count";

    Integer getBlogCount(BlogBean blogBean);
    PageBean getBlogByPage(BlogBean blogBean,PageBean<BlogBean> pageBean,String orderBy,boolean isDesc);

}
