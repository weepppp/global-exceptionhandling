package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author weepppp 2022/8/1 21:16
 **/
@RestController
public class Main {
    int a = 0;

    @GetMapping("/exception")
    public ServerResponseEntity getException() {
        if (a == 0) {
            throw new NotConmentAnswerException("数据异常，请刷新后重新操作");
        }
        return ServerResponseEntity.success();
    }
}
