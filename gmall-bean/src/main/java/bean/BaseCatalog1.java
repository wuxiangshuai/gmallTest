package bean;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @ClassName: BaseCatalog1
 * @Author: WuXiangShuai
 * @Time: 13:37 2019/8/27.
 * @Description:
 */
public class BaseCatalog1 implements Serializable {
    @Id
    @Column
    private String id;
    @Column
    private String name;

    public String getId() {
        return id;
    }

    public BaseCatalog1 setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public BaseCatalog1 setName(String name) {
        this.name = name;
        return this;
    }
}
