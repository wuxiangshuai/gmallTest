package bean;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @ClassName: BaseCatalog2
 * @Author: WuXiangShuai
 * @Time: 13:37 2019/8/27.
 * @Description:
 */
public class BaseCatalog2 implements Serializable {
    @Id
    @Column
    private String id;
    @Column
    private String name;
    @Column
    private String catalog1Id;

    public String getId() {
        return id;
    }

    public BaseCatalog2 setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public BaseCatalog2 setName(String name) {
        this.name = name;
        return this;
    }

    public String getCatalog1Id() {
        return catalog1Id;
    }

    public BaseCatalog2 setCatalog1Id(String catalog1Id) {
        this.catalog1Id = catalog1Id;
        return this;
    }
}
