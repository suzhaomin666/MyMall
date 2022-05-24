package pers.zhaominsu.mymall.product.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import org.apache.ibatis.annotations.Mapper;
import pers.zhaominsu.mymall.product.entity.CommentReplayEntity;

/**
 * 商品评价回复关系
 *
 * @author zsy
 * @email 594983498@qq.com
 * @date 2019-10-01 21:08:48
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {

}
