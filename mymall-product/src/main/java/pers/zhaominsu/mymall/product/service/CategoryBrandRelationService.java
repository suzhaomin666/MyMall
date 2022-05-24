package pers.zhaominsu.mymall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import pers.zhaominsu.mymall.common.utils.PageUtils;
import pers.zhaominsu.mymall.product.entity.BrandEntity;
import pers.zhaominsu.mymall.product.entity.CategoryBrandRelationEntity;


import java.util.List;
import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author zsy
 * @email 594983498@qq.com
 * @date 2019-11-17 21:25:25
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveDetail(CategoryBrandRelationEntity categoryBrandRelation);

    void updateBrand(Long brandId, String name);

    void updateCategory(Long catId, String name);

    List<BrandEntity> getBrandsByCatId(Long catId);

}

