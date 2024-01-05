package com.djl.dd.mapper;

import com.djl.dd.model.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface OrderMapper {

    void insertOrder(Order order);
    Order selectOrderById(Integer id);
    List<Order>  selectOrderByUserid(Integer userId);
    List<Order>  selectOrderByProductid(Integer productId);
    List<Order> selectOrderByUseridAndProductid(Order order);
    List<Order> selectAllOrders();


}
