package pers.zhaominsu.mymall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import pers.zhaominsu.common.utils.PageUtils;
import pers.zhaominsu.mymall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author zhaominsu
 * @email suzhaomin666@gmail.com
 * @date 2022-06-12 00:07:29
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

