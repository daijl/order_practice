package com.djl.dd.mapper;

import com.djl.dd.model.Product;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ProductMapper {

    void insertProduct(Product Product);
    void deleteProductById(Integer id);
    void updateProductById(Integer id);
    Product selectProductById(Integer id);
    Product selectProductByName(String name);
    List<Product> selectAllProducts();


}
