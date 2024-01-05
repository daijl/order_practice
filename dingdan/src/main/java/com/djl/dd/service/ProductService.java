package com.djl.dd.service;

import com.djl.dd.model.Product;

import java.util.List;

public interface ProductService {
    void insertProduct(Product product);
    void deleteProductById(Integer id);
    void updateProductById(Integer id);
    Product selectProductById(Integer id);
    Product selectProductByName(String name);
    List<Product> selectAllProducts();
}
