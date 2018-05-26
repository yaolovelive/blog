package com.yy.service.impl;

import com.yy.mapper.UserMapper;
import com.yy.pojo.UserBean;
import com.yy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service("/userService")
public class UserServiceImpl implements UserService {

    @Autowired(required = false)
    private UserMapper userMapper;

    @Override
    public UserBean login(String uId, String uPassword) {
        UserBean userBean = new UserBean();
        userBean.setUId(uId);
        userBean.setUPassword(uPassword);

        List<UserBean> users = userMapper.getUserByBean(userBean);
        if(users == null || users.size() == 0){
            return null;
        }
        String token = UUID.randomUUID().toString();
        userBean.setUToken(token);
        userMapper.updateUser(userBean);
        users.get(0).setUToken(token);
        return users.get(0);
    }

    @Override
    public UserBean getUserByToken(String uToken) {
        UserBean userBean = new UserBean();
        userBean.setUToken(uToken);
        List<UserBean> users = userMapper.getUserByBean(userBean);
        if(users == null || users.size() == 0){
            return null;
        }
        return users.get(0);
    }

    @Override
    public Integer updateTokent(String uId, String uToken) {
        UserBean userBean = new UserBean();
        userBean.setUId(uId);
        userBean.setUToken(uToken);
        return userMapper.updateUser(userBean);
    }
}
