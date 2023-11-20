package com.bimo.seafoodwave.repository;

import com.bimo.seafoodwave.model.Menu;
import com.bimo.seafoodwave.model.Order;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<Order, ObjectId> {
    Order findOrderByOrderId(String id);
}
