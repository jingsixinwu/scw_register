package com.offcn.user.exception;

import com.offcn.user.enums.UserExceptionEnum;

import javax.management.RuntimeMBeanException;
/**
 * 单表所有用户异常
 * 邮箱
 * 用户名
 * 密码
 */
public class UserException extends RuntimeException {
    public UserException(UserExceptionEnum exceptionEnum) {
        super(exceptionEnum.getMsg());
    }
}
