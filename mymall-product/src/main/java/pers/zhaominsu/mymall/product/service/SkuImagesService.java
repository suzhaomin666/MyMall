package pers.zhaominsu.mymall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import pers.zhaominsu.common.utils.PageUtils;
import pers.zhaominsu.mymall.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author zhaominsu
 * @email suzhaomin666@gmail.com
 * @date 2022-06-10 23:24:44
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

