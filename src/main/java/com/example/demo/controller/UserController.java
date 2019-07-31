package com.example.demo.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import com.example.demo.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author qinchao
 * @since 2019-07-29
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public Result list(){
        return Result.ok(userService.list(new QueryWrapper<>()));
    }

    @GetMapping("{id}")
    public Result getUserById(@PathVariable Integer id){
        return Result.ok(userService.getOne(new QueryWrapper<User>().lambda().eq(User::getId,id)));
    }

    @PostMapping
    public Result addUser(User user){
        user.setCreateTime(LocalDateTime.now());
        return Result.ok(userService.save(user));
    }

    @PutMapping
    public Result updateUser(User user){
        return Result.ok(userService.updateById(user));
    }

    @DeleteMapping("{id}")
    public Result deleteUser(@PathVariable Integer id){
        return Result.ok(userService.removeById(id));
    }

}
