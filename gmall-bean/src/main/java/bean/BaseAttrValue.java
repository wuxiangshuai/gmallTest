package bean;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @ClassName: BaseAttrValue
 * @Author: WuXiangShuai
 * @Time: 13:39 2019/8/27.
 * @Description:
 */
public class BaseAttrValue implements Serializable {
    @Id
    @Column
    private String id;
    @Column(name = "value_name")
    private String valueName;
    @Column(name = "attr_id")
    private String attrId;

    public String getId() {
        return id;
    }

    public BaseAttrValue setId(String id) {
        this.id = id;
        return this;
    }

    public String getValueName() {
        return valueName;
    }

    public BaseAttrValue setValueName(String valueName) {
        this.valueName = valueName;
        return this;
    }

    public String getAttrId() {
        return attrId;
    }

    public BaseAttrValue setAttrId(String attrId) {
        this.attrId = attrId;
        return this;
    }
}