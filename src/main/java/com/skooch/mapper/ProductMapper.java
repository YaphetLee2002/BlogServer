package com.skooch.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.skooch.pojo.Product;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductMapper extends BaseMapper<Product> {
}
