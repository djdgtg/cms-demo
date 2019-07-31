package com.example.demo.service;

import com.example.demo.entity.Score;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author qinchao
 * @since 2019-07-30
 */
public interface ScoreService extends IService<Score> {

    List<Score> getScoreByUserId(Integer userId);
}
