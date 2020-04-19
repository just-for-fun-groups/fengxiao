package com.aoligei.core.utils;

import java.util.UUID;

/**
 * @author JerAxxxxx
 * @version Revision 1.0.0
 * @date 2020/4/19 20:46
 */
public class UuidUtil {
    private UuidUtil() {
    }

    public static String getUuid(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }
}
