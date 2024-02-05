package com.bimo.seafoodwave.service.impl;

import com.bimo.seafoodwave.model.Order;
import com.bimo.seafoodwave.repository.OrderRepository;
import com.bimo.seafoodwave.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.UUID;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository repository;

    public Order addOrder(Order order){
        final String orderId = UUID.randomUUID().toString().substring(0,5);
        int total = 0;
        LocalDateTime now = LocalDateTime.now(ZoneId.of("Asia/Jakarta"));
        for(int i=0; i < order.getCart().size(); i++){
            total = total+ order.getCart().get(i).getTotalPrice();

        }
        order.setOrderId(orderId);
        order.setOrderPrice(total);
        order.setOrderDate(now);
        order.setEstimatedDelivery(now.plusMinutes(12*order.getCart().size()).toString());
        order.setStatus("being prepared");
        return repository.save(order);
    }

    public Order getOrderByOrderId(String orderId){
        return repository.findOrderByOrderId(orderId);
    }

    public Order updateOrder(Order order){
        Order exsistingOrder = repository.findOrderByOrderId(order.getOrderId());
        exsistingOrder.setOrderPrice(order.getOrderPrice());
        exsistingOrder.setCustomer(order.getCustomer());
        exsistingOrder.setStatus(order.getStatus());
        exsistingOrder.setCart(order.getCart());
        exsistingOrder.setEstimatedDelivery(order.getEstimatedDelivery());
        return repository.save(exsistingOrder);
    }
}
