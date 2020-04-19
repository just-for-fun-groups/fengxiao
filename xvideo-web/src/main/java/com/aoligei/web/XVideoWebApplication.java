package com.aoligei.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author JerAxxxxx
 * @version Revision 1.0.0
 * @date 2020/3/9 10:37
 */
@SpringBootApplication(scanBasePackages = "com.aoligei.*")
@MapperScan("com.aoligei.core.mapper")
public class XVideoWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(XVideoWebApplication.class, args);
    }
}
