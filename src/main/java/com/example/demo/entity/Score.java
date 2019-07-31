package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author qinchao
 * @since 2019-07-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_score")
public class Score implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId("ID")
    private Integer id;

    /**
     * 用户id
     */
    @TableField("USER_ID")
    private Integer userId;

    /**
     * 用户名
     */
    @TableField("USERNAME")
    private String userName;

    /**
     * 课程
     */
    @TableField("SUBJECT")
    private String subject;

    /**
     * 分数
     */
    @TableField("SCORE")
    private Integer score;


}
