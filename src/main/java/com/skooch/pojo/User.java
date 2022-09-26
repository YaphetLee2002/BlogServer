package com.skooch.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("user")
public class User {
    private Long id;
    private String username;
    @TableField(value = "password", select = false)
    private String password;
    private String description;
}
