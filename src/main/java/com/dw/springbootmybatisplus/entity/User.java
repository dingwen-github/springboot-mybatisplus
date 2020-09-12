package com.dw.springbootmybatisplus.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.naming.Name;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@TableName(value = "ACT_ID_USER")
public class User {
    @TableId(value = "ID_")
    @TableField(value = "ID_")
    private String id;

    @TableField(value = "REV_")
    private String rev;

    @TableField(value = "FIRST_")
    private String first;

    @TableField(value = "LAST_")
    private String last;

    @TableField(value = "EMAIL_")
    private String email;

    @TableField(value = "PWD_")
    private String pwd;

    @TableField(value = "SALT_")
    private String salt;

    @TableField(value = "LOCK_EXP_TIME_")
    private String lockExpTime;

    @TableField(value = "ATTEMPTS_")
    private String attempts;

    @TableField(value = "PICTURE_ID_")
    private String pictureId;
}
