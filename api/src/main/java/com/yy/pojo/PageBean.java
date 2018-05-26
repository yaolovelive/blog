package com.yy.pojo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

/**
 * Created by jiangyao on 2018/5/26.
 */
public class PageBean<T> implements Serializable {

    @Getter
    @Setter
    private Integer pageNo = 1;

    @Setter
    @Getter
    private Integer pageSize = 10;

    private Integer pageCount = 0;

    public Integer getPageCount() {
        if(this.dataCount % this.pageSize == 0){
            this.pageCount = this.dataCount / this.pageSize;
        }else{
            this.pageCount = this.dataCount / this.pageSize + 1;
        }
        return pageCount;
    }

    @Getter
    @Setter
    private Integer dataCount = 0;

    @Getter
    @Setter
    private List<T> list;

}
