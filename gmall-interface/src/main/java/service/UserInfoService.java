package service;

import bean.UserAddress;
import bean.UserInfo;

import java.util.List;

/**
 * @ClassName: UserInfoService
 * @Author: WuXiangShuai
 * @Time: 13:33 2019/5/31.
 * @Description:
 */
public interface UserInfoService {

    List<UserInfo> getUserInfoList();

    void addUserInfo(UserInfo userInfo);

    void updUserInfo(UserInfo userInfo);

    List<UserAddress> getUserAddressList(String userId);
}
