package com.bimo.seafoodwave.controller;

import com.bimo.seafoodwave.model.Order;
import com.bimo.seafoodwave.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RequestMapping("api/order")
@RestController
public class OrderController {

    @Autowired(required = true)
    private OrderService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Order createOrder(@RequestBody Order order) {return service.addOrder(order);}

    @GetMapping("/{orderId}")
    public Order getOrderbyId(@PathVariable String orderId) { return service.getOrderByOrderId(orderId);}

    @PutMapping
    public Order modifyOrder(@RequestBody Order order){ return service.updateOrder(order);}
}
