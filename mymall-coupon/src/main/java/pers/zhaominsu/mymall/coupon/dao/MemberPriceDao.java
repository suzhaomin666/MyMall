package pers.zhaominsu.mymall.coupon.dao;

import pers.zhaominsu.mymall.coupon.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * 
 * @author zhaominsu
 * @email suzhaomin666@gmail.com
 * @date 2022-06-11 00:57:23
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {
	
}
