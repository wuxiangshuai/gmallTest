package com.gmall.usermanage.controller;

import bean.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.UserInfoService;

import java.util.List;

/**
 * @ClassName: UserInfoController
 * @Author: WuXiangShuai
 * @Time: 13:45 2019/5/31.
 * @Description:
 */
@RestController("user")
public class UserInfoController {
    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping("findAll")
    public List<UserInfo> findAll(){
        List<UserInfo> userInfoList = userInfoService.getUserInfoList();
        return userInfoList;
    }
}
