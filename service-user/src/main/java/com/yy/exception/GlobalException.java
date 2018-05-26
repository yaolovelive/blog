package com.yy.exception;

import com.yy.pojo.ResultMessage;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice(annotations = {RestController.class})
@ResponseBody
public class GlobalException {

    @ExceptionHandler(value = {RuntimeException.class})
    public ResultMessage runtimeException(RuntimeException ex){

        return ResultMessage.error(ex.getMessage());
    }

}
