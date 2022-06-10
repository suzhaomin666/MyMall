package pers.zhaominsu.mymall.product.dao;

import pers.zhaominsu.mymall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author zhaominsu
 * @email suzhaomin666@gmail.com
 * @date 2022-06-10 23:24:44
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
