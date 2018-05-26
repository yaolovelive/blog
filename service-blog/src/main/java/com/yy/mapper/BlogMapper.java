package com.yy.mapper;

import com.yy.pojo.BlogBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by jiangyao on 2018/5/26.
 */
public interface BlogMapper {

    Integer getBlogCount(BlogBean blogBean);
    List<BlogBean> getBlogByPage(@Param("blogBean") BlogBean blogBean,@Param("offset") Integer offset,@Param("size") Integer size,@Param("orderBy") String orderBy,@Param("isDesc") boolean isDesc);

}
