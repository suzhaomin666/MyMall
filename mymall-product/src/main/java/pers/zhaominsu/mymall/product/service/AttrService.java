package pers.zhaominsu.mymall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;


import pers.zhaominsu.common.utils.PageUtils;
import pers.zhaominsu.mymall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author zhaominsu
 * @email suzhaomin666@gmail.com
 * @date 2022-06-10 23:24:44
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

