package com.aoligei.controller;

import com.aoligei.entity.TestUser;
import com.aoligei.service.TestUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/bbb")
    public String method2(@Validated @RequestBody TestUser testUser) {
        String password = testUser.getPassword();
        return password + "123";
    }

    @RequestMapping("/")
    public String toIndexPage() {
        return "index";
    }


    @RequestMapping("/errorPage")
    public String toErrorPage() {
        return "error";
    }


    @RequestMapping("/homePage")
    public String toHomePage() {
        return "home";
    }
}
