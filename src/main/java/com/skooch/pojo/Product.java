package com.skooch.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;

@Data
public class Product {
    @TableId(type = IdType.ASSIGN_UUID)
    private String id;
    private Double price;
    private String name;
    private String description;
    private Date date;
    private String userId;
}
