package com.yy.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * Created by jiangyao on 2018/5/26.
 */
@Getter
@Setter
@ToString
public class BlogBean implements Serializable {

    private Integer bId;
    private String bTitle;
    private String bContent;
    private String bCreateDate;
    private Integer bViewCount;
    private Integer bIsDel;

}
