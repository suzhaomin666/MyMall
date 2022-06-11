package pers.zhaominsu.mymall.member.dao;

import pers.zhaominsu.mymall.member.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author zhaominsu
 * @email suzhaomin666@gmail.com
 * @date 2022-06-12 00:19:12
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
