package com.gmall.controller;

import bean.UserAddress;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.UserInfoService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @ClassName: OrderController
 * @Author: WuXiangShuai
 * @Time: 16:46 2019/5/31.
 * @Description:
 */
@Controller("order")
public class OrderController {

    @Reference
    private UserInfoService userInfoService;

    @RequestMapping("trade")
    @ResponseBody
    public List<UserAddress> trade(HttpServletRequest request){
        String userId = request.getParameter("userId");
        System.out.println(userId);
        List<UserAddress> userAddressList = userInfoService.getUserAddressList(userId);
        return  userAddressList;
    }

}
