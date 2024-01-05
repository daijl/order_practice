package com.djl.dd.service;

import com.djl.dd.model.Order;

import java.util.List;

public interface OrderService {
    void insertOrder(Order order) throws Exception;
    Order selectOrderById(Integer id);
    List<Order>  selectOrderByUserid(Integer userId);
    List<Order>  selectOrderByProductid(Integer productId);
    List<Order> selectAllOrders();
}
