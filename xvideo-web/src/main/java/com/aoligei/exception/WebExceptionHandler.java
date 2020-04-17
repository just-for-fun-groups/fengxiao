package com.aoligei.exception;

import com.aoligei.entity.vo.ResultVO;
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


    /**
     * 对所有参数校验的异常捕获,并统一返回
     *
     * @param e
     * @return
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResultVO exceptionHandler(MethodArgumentNotValidException e) {
        String message = Objects.requireNonNull(e.getBindingResult().getFieldError()).getDefaultMessage();
        log.error(message);
        ResultVO resultVo = new ResultVO(message, "E001", "");
        return resultVo;
    }
}
