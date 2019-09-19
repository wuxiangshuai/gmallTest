package bean;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @ClassName: SpuInfo
 * @Author: WuXiangShuai
 * @Time: 15:59 2019/8/27.
 * @Description:
 */
public class SpuInfo implements Serializable {
    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column
    private String spuName;

    @Column
    private String description;

    @Column
    private  String catalog3Id;

    public String getId() {
        return id;
    }

    public SpuInfo setId(String id) {
        this.id = id;
        return this;
    }

    public String getSpuName() {
        return spuName;
    }

    public SpuInfo setSpuName(String spuName) {
        this.spuName = spuName;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public SpuInfo setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getCatalog3Id() {
        return catalog3Id;
    }

    public SpuInfo setCatalog3Id(String catalog3Id) {
        this.catalog3Id = catalog3Id;
        return this;
    }
}
