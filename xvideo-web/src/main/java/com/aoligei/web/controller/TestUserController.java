package com.aoligei.web.controller;

import com.aoligei.core.response.ResultUtil;
import com.aoligei.core.response.ResultVO;
import com.aoligei.web.entity.TestUserVO;
import com.aoligei.web.service.TestUserService;
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

    @GetMapping("/aaa/{id}")
    public TestUserVO getOne(@PathVariable("id") String id) {
        TestUserVO testUserVO = testUserService.selectByPrimaryKey(id);
        return testUserVO;
    }

    @PostMapping("/insert")
    public ResultVO insert(@Validated @RequestBody TestUserVO testUserVo) {
        testUserService.insertSelective(testUserVo);
        return ResultUtil.buildSuccess("添加成功", "ok");
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
