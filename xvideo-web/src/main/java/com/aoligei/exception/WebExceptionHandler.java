package com.aoligei.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Objects;

/**
 * @author JerAxxxxx
 * @version Revision 1.0.0
 * @date 2020/3/9 14:17
 */
@Slf4j
@ControllerAdvice(basePackages = {"com.aoligei.controller"})
public class WebExceptionHandler {


    @ExceptionHandler(MethodArgumentNotValidException.class)
    public String exceptionHandler(MethodArgumentNotValidException e) {
        String message = Objects.requireNonNull(e.getBindingResult().getFieldError()).getDefaultMessage();
        log.error(message);
        return message + "asd";
    }
}
