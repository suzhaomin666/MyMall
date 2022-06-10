package pers.zhaominsu.mymall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import pers.zhaominsu.common.utils.PageUtils;
import pers.zhaominsu.mymall.product.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author zhaominsu
 * @email suzhaomin666@gmail.com
 * @date 2022-06-10 23:24:44
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

