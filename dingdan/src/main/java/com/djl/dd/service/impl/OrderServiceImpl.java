package com.djl.dd.service.impl;

import com.djl.dd.mapper.OrderMapper;
import com.djl.dd.model.Order;
import com.djl.dd.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    /**
     * 注入mapper至service层
     */
    @Resource
    private OrderMapper orderMapper;

    @Override
    public void insertOrder(Order order) throws Exception {
//        Integer userId = order.getUserId();
//        Integer productId = order.getProductId();
        List<Order> orders = orderMapper.selectOrderByUseridAndProductid(order);
        if (orders.size()>0){
            throw new Exception("您已预约该产品");
        }
        orderMapper.insertOrder(order);
    };


    @Override
    public Order selectOrderById(Integer id){
        return orderMapper.selectOrderById(id);
    }

    @Override
    public List<Order> selectOrderByUserid(Integer userId){
        return orderMapper.selectOrderByUserid(userId);
    };

    @Override
    public List<Order>  selectOrderByProductid(Integer productId){
        return orderMapper.selectOrderByProductid(productId);
    };

    @Override
    public List<Order> selectAllOrders(){
        return orderMapper.selectAllOrders();
    };
}
