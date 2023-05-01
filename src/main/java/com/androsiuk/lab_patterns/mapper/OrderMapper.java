package com.androsiuk.lab_patterns.mapper;

import com.androsiuk.lab_patterns.DTO.OrderDTO;
import com.androsiuk.lab_patterns.entity.Order;
import org.springframework.stereotype.Component;
@Component
public class OrderMapper implements Mapper<Order, OrderDTO>{
    @Override
    public OrderDTO map(Order order) {
        OrderDTO.OrderDTOBuilder orderDTOBuilder = OrderDTO.builder();
        orderDTOBuilder.id(order.getId());
        orderDTOBuilder.address(order.getAddress());
        orderDTOBuilder.quantity(order.getQuantity());
        orderDTOBuilder.shoppingCart_id(order.getShoppingCart().getId());
        orderDTOBuilder.buyer_id(order.getBuyer().getId());
        return orderDTOBuilder.build();
    }
}
