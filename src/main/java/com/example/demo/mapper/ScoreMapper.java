package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.Score;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author qinchao
 * @since 2019-07-30
 */
public interface ScoreMapper extends BaseMapper<Score> {

    /**
     * 也可以用原始xml文件方式
     * @param userId
     * @return
     */
    @Select("select * from t_score s left join t_user u on s.user_id=u.id where user_id=#{userId}")
    List<Score> getScoreByUserId(Integer userId);

}
