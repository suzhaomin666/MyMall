package pers.zhaominsu.mymall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import pers.zhaominsu.common.utils.PageUtils;
import pers.zhaominsu.mymall.product.entity.CommentReplayEntity;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author zhaominsu
 * @email suzhaomin666@gmail.com
 * @date 2022-06-10 23:24:44
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

