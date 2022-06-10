package pers.zhaominsu.mymall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import pers.zhaominsu.common.utils.PageUtils;
import pers.zhaominsu.mymall.product.entity.SpuInfoDescEntity;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author zhaominsu
 * @email suzhaomin666@gmail.com
 * @date 2022-06-10 23:24:44
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

