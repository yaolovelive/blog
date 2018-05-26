package com.yy.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * Created by jiangyao on 2018/5/24.
 */
@Getter
@Setter
@ToString
public class UserBean implements Serializable {
    private String uId;
    private String uPassword;
    private String uNick;
    private Integer uAge;
    private String uSex;
    private String uEmail;
    private String uPhone;
    private String uPersonalitySignature;
    private String uLastLoginDate;
    private String uLastLoginIp;
    private String uHeader;
    private String  uToken;
}
