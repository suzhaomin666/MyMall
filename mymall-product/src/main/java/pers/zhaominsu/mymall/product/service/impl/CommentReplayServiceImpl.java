package pers.zhaominsu.mymall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import org.springframework.stereotype.Service;
import pers.zhaominsu.mymall.common.utils.PageUtils;
import pers.zhaominsu.mymall.common.utils.Query;
import pers.zhaominsu.mymall.product.dao.CommentReplayDao;
import pers.zhaominsu.mymall.product.entity.CommentReplayEntity;
import pers.zhaominsu.mymall.product.service.CommentReplayService;

import java.util.Map;


@Service("commentReplayService")
public class CommentReplayServiceImpl extends ServiceImpl<CommentReplayDao, CommentReplayEntity> implements CommentReplayService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CommentReplayEntity> page = this.page(
                new Query<CommentReplayEntity>().getPage(params),
                new QueryWrapper<CommentReplayEntity>()
        );

        return new PageUtils(page);
    }

}
