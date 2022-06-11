package pers.zhaominsu.mymall.coupon.dao;

import pers.zhaominsu.mymall.coupon.entity.HomeSubjectEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 * 
 * @author zhaominsu
 * @email suzhaomin666@gmail.com
 * @date 2022-06-11 00:57:23
 */
@Mapper
public interface HomeSubjectDao extends BaseMapper<HomeSubjectEntity> {
	
}
