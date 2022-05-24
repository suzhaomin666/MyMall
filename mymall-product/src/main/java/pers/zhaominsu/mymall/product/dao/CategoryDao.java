package pers.zhaominsu.mymall.product.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zsy.product.entity.CategoryEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 *
 * @author zsy
 * @email 594983498@qq.com
 * @date 2019-10-01 21:08:48
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {

}
