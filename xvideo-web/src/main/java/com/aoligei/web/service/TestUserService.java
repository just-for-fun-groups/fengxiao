package com.aoligei.web.service;


import com.aoligei.web.entity.TestUserVO;

/**
 * @author JerAxxxxx
 * @version Revision 1.0.0
 * @date 2020/3/9 11:13
 */
public interface TestUserService {


    int deleteByPrimaryKey(String id);


    int insertSelective(TestUserVO record);

    TestUserVO selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TestUserVO record);


}
