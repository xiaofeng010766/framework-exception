package com.framework.exception;

import java.util.ArrayList;
import java.util.List;

import com.framework.exception.bean.ExceptionMessage;

/**
 * 系统异常处理类
 *
 * @author liu_tao2
 * @version 1.0
 */
public class SystemException extends AbstractManagedException {

    private static final long serialVersionUID = -1618698850942386977L;

    /**
     * 系统异常处理构造函数<br/>
     * Demo ： <br/>
     * throw new SystemException(new String());
     *
     * @param messageCode 需要返回的系统异常信息
     */
    public SystemException(String messageCode) {
        super(new ExceptionMessage(messageCode).toString());
        List<ExceptionMessage> messages = new ArrayList<ExceptionMessage>();
        ExceptionMessage message = new ExceptionMessage(messageCode);
        messages.add(message);
        super.setType(ExceptionType.SYSTEM_EXCEPTION);
        super.setMessages(messages);
    }

    /**
     * 系统异常处理构造函数<br/>
     * Demo ： <br/>
     * throw new SystemException(new String(), String...);
     *
     * @param messageCode 需要返回的系统异常信息
     */
    public SystemException(String messageCode, String... messageParams) {
        super(new ExceptionMessage(messageCode,messageParams).toString());
        List<ExceptionMessage> messages = new ArrayList<ExceptionMessage>();
        ExceptionMessage message = new ExceptionMessage(messageCode, messageParams);
        messages.add(message);
        super.setType(ExceptionType.SYSTEM_EXCEPTION);
        super.setMessages(messages);
    }

    /**
     * 系统异常处理构造函数<br/>
     * Demo ： <br/>
     * throw new SystemException(new List<ExceptionMessage>());
     *
     * @param messages 需要返回的系统异常信息
     */
    public SystemException(List<ExceptionMessage> messages) {
        super(messages.toString());
        super.setType(ExceptionType.SYSTEM_EXCEPTION);
        super.setMessages(messages);
    }

    /**
     * 系统异常处理构造函数<br/>
     * Demo ： <br/>
     * throw new SystemException(new Throwable());
     *
     * @param cause 需要返回的系统异常的接口
     */
    public SystemException(Throwable cause) {
        super(cause);
        super.setType(ExceptionType.SYSTEM_EXCEPTION);
    }

    /**
     * 系统异常处理构造函数<br/>
     * Demo ： <br/>
     * throw new SystemException(new List<ExceptionMessage>(),new Throwable());
     *
     * @param messages 需要返回的系统异常信息
     * @param cause    需要返回的系统异常的接口
     */
    public SystemException(List<ExceptionMessage> messages, Throwable cause) {
        super(cause);
        super.setType(ExceptionType.SYSTEM_EXCEPTION);
        super.setMessages(messages);
    }


    public List<ExceptionMessage> getExceptionMessage(){
            return super.getMessages();
    }
}
