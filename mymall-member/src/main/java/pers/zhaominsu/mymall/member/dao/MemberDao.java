package pers.zhaominsu.mymall.member.dao;

import pers.zhaominsu.mymall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author zhaominsu
 * @email suzhaomin666@gmail.com
 * @date 2022-06-12 00:07:29
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
