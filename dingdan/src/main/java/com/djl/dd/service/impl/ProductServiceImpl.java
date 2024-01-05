package com.djl.dd.service.impl;

import com.djl.dd.mapper.ProductMapper;
import com.djl.dd.model.Product;
import com.djl.dd.service.ProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    /**
     * 注入mapper至service层
     */
    @Resource
    private ProductMapper productMapper;

    @Override
    public void insertProduct(Product product){
        productMapper.insertProduct(product);
    };

    @Override
    public void deleteProductById(Integer id){
        productMapper.deleteProductById(id);
    };

    @Override
    public void updateProductById(Integer id){
        productMapper.updateProductById(id);
    };

    @Override
    public Product selectProductById(Integer id){
        return productMapper.selectProductById(id);
    }

    @Override
    public Product selectProductByName(String name){
        return productMapper.selectProductByName(name);
    };

    @Override
    public List<Product> selectAllProducts(){
        return productMapper.selectAllProducts();
    };
}
