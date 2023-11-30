package com.bimo.seafoodwave.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Document(collection = "order")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    @Id
    private String id;
    private String orderId;
    private LocalDateTime orderDate;
    private String customer;
    private String phone;
    private String address;
    private String status;
    private String estimatedDelivery;
    private Integer orderPrice;
    private List<Cart> cart;
}
