package com.bimo.seafoodwave.repository;

import com.bimo.seafoodwave.model.Menu;
import com.bimo.seafoodwave.model.Order;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface OrderRepository extends MongoRepository<Order, ObjectId> {
    Order findOrderByOrderId(String id);
}
