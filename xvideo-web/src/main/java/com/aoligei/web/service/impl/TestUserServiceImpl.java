package com.aoligei.web.service.impl;

import com.aoligei.core.entity.po.TestUser;
import com.aoligei.core.mapper.TestUserMapper;
import com.aoligei.core.utils.UuidUtil;
import com.aoligei.web.entity.TestUserVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aoligei.web.service.TestUserService;
import org.springframework.util.StringUtils;

/**
 * @author JerAxxxxx
 * @version Revision 1.0.0
 * @date 2020/3/9 11:13
 */
@Service
public class TestUserServiceImpl implements TestUserService {

    @Autowired
    private TestUserMapper testUserMapper;

    @Override
    public int deleteByPrimaryKey(String id) {
        return testUserMapper.deleteByPrimaryKey(id);
    }


    @Override
    public int insertSelective(TestUserVO record) {
        TestUser testUser = transToPo(record);
        return testUserMapper.insertSelective(testUser);
    }

    @Override
    public TestUserVO selectByPrimaryKey(String id) {
        TestUser testUser = testUserMapper.selectByPrimaryKey(id);
        TestUserVO testUserVO = new TestUserVO();
        BeanUtils.copyProperties(testUser, testUserVO);
        return testUserVO;
    }

    @Override
    public int updateByPrimaryKeySelective(TestUserVO record) {
        TestUser testUser = transToPo(record);
        return testUserMapper.updateByPrimaryKeySelective(testUser);
    }


    private TestUser transToPo(TestUserVO testUserVo) {
        TestUser testUser = new TestUser();
        if (StringUtils.isEmpty(testUserVo.getId())) {
            testUser.setId(UuidUtil.getUuid());
        } else {
            testUser.setId(testUserVo.getId());
        }
        testUser.setName(testUserVo.getName());
        testUser.setPassword(testUserVo.getPassword());
        testUser.setRole(testUserVo.getRole());
        return testUser;
    }

}
