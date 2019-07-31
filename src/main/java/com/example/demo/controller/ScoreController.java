package com.example.demo.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.entity.Score;
import com.example.demo.service.ScoreService;
import com.example.demo.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author qinchao
 * @since 2019-07-30
 */
@RestController
@RequestMapping("/score")
public class ScoreController {

    @Autowired
    private ScoreService scoreService;

    @GetMapping("{userId}")
    public Result getScoreByUserId(@PathVariable Integer userId){
        //return Result.ok(scoreService.list(new QueryWrapper<Score>().lambda().eq(Score::getUserId,userId)));
        return Result.ok(scoreService.getScoreByUserId(userId));
    }

}
