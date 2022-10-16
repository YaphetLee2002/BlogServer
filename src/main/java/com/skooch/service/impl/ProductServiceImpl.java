package com.skooch.service.impl;

import com.skooch.mapper.ProductMapper;
import com.skooch.pojo.Product;
import com.skooch.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public boolean addProduct(Product product) {
        return productMapper.insert(product) > 0;
    }
}
