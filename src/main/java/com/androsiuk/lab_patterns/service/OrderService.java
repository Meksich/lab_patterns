package com.androsiuk.lab_patterns.service;

import com.androsiuk.lab_patterns.entity.Order;
import com.androsiuk.lab_patterns.repository.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@org.springframework.stereotype.Service
@AllArgsConstructor
public class OrderService extends com.androsiuk.lab_patterns.service.Service<Order> {
    private OrderRepository orderRepository;
    @Override
    public JpaRepository<Order, Integer> getRepository() {
        return orderRepository;
    }

    public List<Order> getBuyersOrders(Integer buyer_id){
        List<Order> orderList = getAll();
        orderList.removeIf((order -> (!order.getBuyer().getId().equals(buyer_id))));
        return orderList;
    }
}