package com.aoligei.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

/**
 * @author JerAxxxxx
 * @version Revision 1.0.0
 * @date 2020/3/9 11:13
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TestUser {
    private Integer id;

    private String name;

    @NotBlank(message = "密码不能为空")
    private String password;

    private String role;
}