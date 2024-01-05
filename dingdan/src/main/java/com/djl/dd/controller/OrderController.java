package com.djl.dd.controller;


import com.djl.dd.model.Order;
import com.djl.dd.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/order")
public class OrderController {

    @Autowired
    private OrderService orderService;


    @PostMapping(value = "/insertOrder")
    public String insertOrder(Order order){
        try {
            orderService.insertOrder(order);
            return "成功";
        } catch (Exception e) {
            return e.getMessage();
        }
    };


    @GetMapping(value = "/getOrderById")
    public Order getOrderById(Integer id){
        if(id != null){
            return orderService.selectOrderById(id);
        }else{
            return null;
        }
    }

    @PostMapping(value = "/selectOrderByUserid")
    public List<Order> selectOrderByUserid(Integer userId){
        return orderService.selectOrderByUserid(userId);
    };


    @PostMapping(value = "/selectAllOrders")
    public List<Order> selectAllOrders(){
        return orderService.selectAllOrders();
    };

}
