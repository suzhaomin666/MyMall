package pers.zhaominsu.mymall.order.dao;

import pers.zhaominsu.mymall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author zhaominsu
 * @email suzhaomin666@gmail.com
 * @date 2022-06-12 00:21:05
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
