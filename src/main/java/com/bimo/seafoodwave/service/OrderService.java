package com.bimo.seafoodwave.service;

import com.bimo.seafoodwave.model.Order;

public interface OrderService {
    Order addOrder(Order order);
    Order getOrderByOrderId(String orderId);
    Order updateOrder(Order order);
}
