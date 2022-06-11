package pers.zhaominsu.mymall.coupon.dao;

import pers.zhaominsu.mymall.coupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author zhaominsu
 * @email suzhaomin666@gmail.com
 * @date 2022-06-11 00:57:23
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}
