package pers.zhaominsu.mymall.product.dao;

import pers.zhaominsu.mymall.product.entity.CategoryBrandRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 品牌分类关联
 * 
 * @author zhaominsu
 * @email suzhaomin666@gmail.com
 * @date 2022-06-10 23:24:44
 */
@Mapper
public interface CategoryBrandRelationDao extends BaseMapper<CategoryBrandRelationEntity> {
	
}
