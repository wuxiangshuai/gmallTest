package bean;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @ClassName: BaseCatalog3
 * @Author: WuXiangShuai
 * @Time: 13:38 2019/8/27.
 * @Description:
 */
public class BaseCatalog3 implements Serializable {
    @Id
    @Column
    private String id;
    @Column
    private String name;
    @Column
    private String catalog2Id;

    public String getId() {
        return id;
    }

    public BaseCatalog3 setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public BaseCatalog3 setName(String name) {
        this.name = name;
        return this;
    }

    public String getCatalog2Id() {
        return catalog2Id;
    }

    public BaseCatalog3 setCatalog2Id(String catalog2Id) {
        this.catalog2Id = catalog2Id;
        return this;
    }
}
