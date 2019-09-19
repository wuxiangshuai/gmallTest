package service;

import bean.*;

import java.util.List;

/**
 * @ClassName: ManageService
 * @Author: WuXiangShuai
 * @Time: 13:44 2019/8/27.
 * @Description:
 */
public interface ManageService {
    // 一级分类
    List<BaseCatalog1> getCatalog1();
    // 二级分类
    List<BaseCatalog2> getCatalog2(String catalog1Id);
    // 三级分类
    List<BaseCatalog3> getCatalog3(String catalog2Id);
    // 获取属性值集合
    List<BaseAttrInfo> getAttrList(String catalog3Id);
    // 保存属性
    void saveAttrInfo(BaseAttrInfo baseAttrInfo);
    // 根据id获取属性
    BaseAttrInfo getAttrInfo(String attrId);
    // 获取 spu 集合
    List<SpuInfo> getSpuInfoList(SpuInfo spuInfo);
}
