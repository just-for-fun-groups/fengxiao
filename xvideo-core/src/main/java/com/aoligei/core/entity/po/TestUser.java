package com.aoligei.core.entity.po;

import lombok.*;


/**
 * @author JerAxxxxx
 * @version Revision 1.0.0
 * @date 2020/4/19 20:38
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TestUser {
    private String id;

    private String name;

    private String password;

    private String role;
}