package com.aoligei.core.entity.po;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author JerAxxxxx
 * @version Revision 1.0.0
 * @date 2020/4/21 15:41
 */
@Data
public class BasePo implements Serializable {
    private String id;

    private Date createTime;

    private Date updateTime;
}
