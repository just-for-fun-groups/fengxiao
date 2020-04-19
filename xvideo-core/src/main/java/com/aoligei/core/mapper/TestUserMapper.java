package com.aoligei.core.mapper;

import com.aoligei.core.entity.po.TestUser;

/**
 * @author JerAxxxxx
 * @version Revision 1.0.0
 * @date 2020/4/19 20:38
 */
public interface TestUserMapper {
    int deleteByPrimaryKey(String id);

    /**
     * 插入
     *
     * @param record
     * @return
     */
    int insertSelective(TestUser record);

    /**
     * 根据主键查询
     *
     * @param id
     * @return
     */
    TestUser selectByPrimaryKey(String id);

    /**
     * 更新
     *
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(TestUser record);

}