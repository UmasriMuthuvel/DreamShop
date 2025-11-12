package com.example.dreamshop.service.order;

import java.util.List;

import com.example.dreamshop.dto.OrderDto;
import com.example.dreamshop.model.Order;

public interface IOrderService {
	Order placeOrder(Long userId);
    OrderDto getOrder(Long orderId);
    List<OrderDto> getUserOrders(Long userId);

}
