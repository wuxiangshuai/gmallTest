package bean;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * @ClassName: BaseAttrInfo
 * @Author: WuXiangShuai
 * @Time: 13:38 2019/8/27.
 * @Description:
 */
public class BaseAttrInfo implements Serializable {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @Column
    private String attrName;
    @Column
    private String catalog3Id;
    @Transient
    private List<BaseAttrValue> attrValueList;

    public List<BaseAttrValue> getAttrValueList() {
        return attrValueList;
    }

    public BaseAttrInfo setAttrValueList(List<BaseAttrValue> attrValueList) {
        this.attrValueList = attrValueList;
        return this;
    }

    public String getId() {
        return id;
    }

    public BaseAttrInfo setId(String id) {
        this.id = id;
        return this;
    }

    public String getAttrName() {
        return attrName;
    }

    public BaseAttrInfo setAttrName(String attrName) {
        this.attrName = attrName;
        return this;
    }

    public String getCatalog3Id() {
        return catalog3Id;
    }

    public BaseAttrInfo setCatalog3Id(String catalog3Id) {
        this.catalog3Id = catalog3Id;
        return this;
    }
}