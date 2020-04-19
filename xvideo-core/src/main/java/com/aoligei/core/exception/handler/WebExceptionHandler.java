package com.aoligei.core.exception.handler;

import com.aoligei.core.response.ResultUtil;
import com.aoligei.core.response.ResultVO;
import lombok.extern.slf4j.Slf4j;
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
@ControllerAdvice
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
        return ResultUtil.buildError(message);
    }
}
