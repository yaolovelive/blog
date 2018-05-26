package com.yy.service;


import com.yy.pojo.UserBean;

public interface UserService {

    UserBean login(String uId, String uPassword);

    UserBean getUserByToken(String uToken);

    Integer updateTokent(String uId, String uToken);
}
