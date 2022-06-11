package pers.zhaominsu.mymall.ware.dao;

import pers.zhaominsu.mymall.ware.entity.PurchaseEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 采购信息
 * 
 * @author zhaominsu
 * @email suzhaomin666@gmail.com
 * @date 2022-06-12 00:27:38
 */
@Mapper
public interface PurchaseDao extends BaseMapper<PurchaseEntity> {
	
}
