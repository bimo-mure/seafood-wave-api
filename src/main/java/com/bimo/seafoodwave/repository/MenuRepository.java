package com.bimo.seafoodwave.repository;

import com.bimo.seafoodwave.model.Menu;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface MenuRepository extends MongoRepository<Menu, ObjectId> {
    List<Menu> findByCategory(String category);
    Menu findMenuByMenuId(String menuId);
    String deleteMenuByMenuId(String menuId);
}
