package com.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author weepppp 2022/8/1 21:07
 * 全局异常处理类
 **/
@Slf4j
@RestControllerAdvice
@RestController
public class Exception {

    @ExceptionHandler(NotConmentAnswerException.class)
    public ResponseEntity<ServerResponseEntity<Object>> notConmentAnswerException(NotConmentAnswerException e) {
        ResponseEnum responseEnum = e.getResponseEnum();
        if (responseEnum != null) {
            return ResponseEntity.status(HttpStatus.OK).body(ServerResponseEntity.fail(responseEnum, e.getObject()));
        }
        ServerResponseEntity<Object> entity = ServerResponseEntity.showFailMsg(e.getMessage());
        log.info("如果有异常，输出的json为：{}", entity.toString());
        return ResponseEntity.status(HttpStatus.OK).body(ServerResponseEntity.showFailMsg(e.getMessage()));

    }

}
