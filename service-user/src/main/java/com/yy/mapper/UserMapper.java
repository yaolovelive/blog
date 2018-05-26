package com.yy.mapper;


import com.yy.pojo.UserBean;

import java.util.List;

/**
 * Created by jiangyao on 2018/5/24.
 */
public interface UserMapper {

    List<UserBean> getUserByBean(UserBean userBean);

    Integer updateUser(UserBean userBean);
}
