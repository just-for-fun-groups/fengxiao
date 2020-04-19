package com.aoligei.core.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author JerAxxxxx
 * @version Revision 1.0.0
 * @date 2020/4/17 16:04
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultVO {

    private String msg;

    private String code;

    private Object data;
}
