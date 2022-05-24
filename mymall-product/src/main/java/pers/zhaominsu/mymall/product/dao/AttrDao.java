package pers.zhaominsu.mymall.product.dao;

import pers.zhaominsu.mymall.product.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * 
 * @author zhaominsu
 * @email suzhaomin666@gmail.com
 * @date 2021-11-10 03:02:14
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}
