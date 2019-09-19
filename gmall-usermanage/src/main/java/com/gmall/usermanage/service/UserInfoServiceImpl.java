package com.gmall.usermanage.service;

import bean.UserAddress;
import bean.UserInfo;

import com.alibaba.dubbo.config.annotation.Service;
import com.gmall.usermanage.mapper.UserAddressMapper;
import com.gmall.usermanage.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import service.UserInfoService;

import java.util.List;

/**
 * @ClassName: UserInfoServiceImpl
 * @Author: WuXiangShuai
 * @Time: 13:35 2019/5/31.
 * @Description:
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Autowired
    private UserAddressMapper useraddressMapper;

    @Override
    public List<UserInfo> getUserInfoList() {
        return userInfoMapper.selectAll();
    }

    @Override
    public void addUserInfo(UserInfo userInfo) {
        userInfoMapper.insertSelective(userInfo);
    }

    @Override
    public void updUserInfo(UserInfo userInfo) {
        userInfoMapper.updateByPrimaryKey(userInfo);
    }

    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        UserAddress userAddress = new UserAddress();
        userAddress.setUserId(userId);
        List<UserAddress> addresses = useraddressMapper.select(userAddress);
        return addresses;
    }

}
