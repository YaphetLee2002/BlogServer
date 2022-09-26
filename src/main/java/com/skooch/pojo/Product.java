package com.skooch.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class Product {

    private String id;
    private Double price;
    private Date date;

}
