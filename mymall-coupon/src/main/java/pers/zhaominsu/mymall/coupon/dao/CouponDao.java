package pers.zhaominsu.mymall.coupon.dao;

import pers.zhaominsu.mymall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author zhaominsu
 * @email suzhaomin666@gmail.com
 * @date 2022-06-11 00:57:23
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
