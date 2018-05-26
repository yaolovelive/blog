package com.yy.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ResultMessage<T> {
    private Integer state;
    private String msg;
    private  T data;
    private ResultMessage(){};

    public static ResultMessage error(String msg){
        ResultMessage resultMessage = new ResultMessage();
        resultMessage.setState(500);
        resultMessage.setMsg(msg);
        return resultMessage;
    }

    public static <T> ResultMessage ok(T obj){
        ResultMessage<T> resultMessage = new ResultMessage();
        resultMessage.setData(obj);
        resultMessage.setState(200);
        return resultMessage;
    }

}
