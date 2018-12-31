package com.an.sss;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 * Created by an_wch on 2018/12/29.
 */
@SpringBootApplication
@Slf4j
public class ApiApplication {

    /**
     * 启动
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
        log.info("启动成功");
    }
}
