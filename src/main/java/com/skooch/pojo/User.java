package com.skooch.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("user")
public class User {
    @TableId(type = IdType.ASSIGN_UUID)
    private String id;
    private String username;
    @TableField(value = "password", select = false)
    private String password;
    private String description;
}
