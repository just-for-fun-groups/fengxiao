package com.aoligei.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

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

    @NotBlank(message = "名称不能为空")
    @Length(max = 10, message = "名称不能超过10个字符")
    private String name;

    @NotBlank(message = "密码不能为空")
    private String password;

    @NotBlank(message = "角色不能为空")
    @Pattern(regexp = "[0-9]*", message = "格式非法")
    private String role;
}