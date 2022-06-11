package pers.zhaominsu.mymall.order.dao;

import pers.zhaominsu.mymall.order.entity.OrderOperateHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单操作历史记录
 * 
 * @author zhaominsu
 * @email suzhaomin666@gmail.com
 * @date 2022-06-12 00:21:05
 */
@Mapper
public interface OrderOperateHistoryDao extends BaseMapper<OrderOperateHistoryEntity> {
	
}
