package com.aoligei.controller;

import com.aoligei.service.TestUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author JerAxxxxx
 * @version Revision 1.0.0
 * @date 2020/3/9 11:16
 */
@RestController
@RequestMapping("/test")
public class TestUserController {


    @Autowired
    private TestUserService testUserService;

    @GetMapping("/aaa")
    public String method() {
        return testUserService.selectByPrimaryKey(1).getName();
    }
}
