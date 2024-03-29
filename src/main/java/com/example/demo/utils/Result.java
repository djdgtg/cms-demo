package com.example.demo.utils;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName Result
 * @Description
 * @Author qinchao
 * @Date 2019/7/29 14:25
 * @Version V1.0
 **/
@Data
public class Result implements Serializable {

    // 响应业务状态
    private Integer status;

    // 响应消息
    private String msg;

    // 响应中的数据
    private Object data;

    public static Result build(Integer status, String msg, Object data) {
        return new Result(status, msg, data);
    }

    public static Result ok(Object data) {
        return new Result(data);
    }

    public static Result ok() {
        return new Result(null);
    }

    public Result() {

    }

    public static Result build(Integer status, String msg) {
        return new Result(status, msg, null);
    }

    public Result(Integer status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public Result(Object data) {
        this.status = 200;
        this.msg = "操作成功！";
        this.data = data;
    }

}
