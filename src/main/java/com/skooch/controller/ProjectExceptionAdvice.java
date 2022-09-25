package com.skooch.controller;

import com.skooch.exception.BusinessException;
import com.skooch.exception.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProjectExceptionAdvice {

    @ExceptionHandler(SecurityException.class)
    public Result doSystemException(SystemException systemException) {
        return new Result(systemException.getCode(), null, systemException.getMessage());
    }

    @ExceptionHandler(BusinessException.class)
    public Result doBusinessException(BusinessException businessException) {
        return new Result(businessException.getCode(), null, businessException.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public Result doException() {
        return new Result(Code.SYSTEM_UNKNOWN_ERR, null, "系统未知错误");
    }

}
