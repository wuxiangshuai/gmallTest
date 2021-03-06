package bean;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @ClassName: UserAddress
 * @Author: WuXiangShuai
 * @Time: 16:31 2019/5/31.
 * @Description:
 */
public class UserAddress implements Serializable {
    @Column
    @Id
    private String id;
    @Column(name = "user_address")
    private String userAddress;
    @Column(name = "user_id")
    private String userId;
    @Column(name = "consignee")
    private String consignee;
    @Column(name = "phone_num")
    private String phoneNum;
    @Column(name = "is_default")
    private String isDefault;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
    }
}
