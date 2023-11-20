package com.bimo.seafoodwave.service.impl;

import com.bimo.seafoodwave.model.Order;
import com.bimo.seafoodwave.repository.OrderRepository;
import com.bimo.seafoodwave.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository repository;

    public Order addOrder(Order order){
        int total = 0;
        LocalDateTime now = LocalDateTime.now();
        for(int i=0; i < order.getCart().size(); i++){
            total = total+ order.getCart().get(i).getTotalPrice();
        }
        order.setOrderPrice(total);
        order.setEstimatedDelivery(now.plusMinutes(30).toString());
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
