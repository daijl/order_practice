package com.djl.dd.controller;


import com.djl.dd.model.Product;
import com.djl.dd.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    private ProductService productService;


    @PostMapping(value = "/insertProduct")
    public void insertProduct(Product product){
        productService.insertProduct(product);
    };

    @PostMapping(value = "/deleteProductById")
    public void deleteProductById(Integer id){
        productService.deleteProductById(id);
    };

    @PostMapping(value = "/updateProductById")
    public void updateProductById(Integer id){
        productService.updateProductById(id);
    };

    @PostMapping(value = "/getProductById")
    public Product getProductById(Integer id){
        if(id != null){
            return productService.selectProductById(id);
        }else{
            return null;
        }
    }

    @PostMapping(value = "/selectProductByName")
    public Product selectProductByName(String name){
        return productService.selectProductByName(name);
    };


    @PostMapping(value = "/selectAllProducts")
    public List<Product> selectAllProducts(){
        return productService.selectAllProducts();
    };

}
