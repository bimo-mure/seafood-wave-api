package com.bimo.seafoodwave.service;

import com.bimo.seafoodwave.model.Menu;
import org.bson.types.ObjectId;

import java.util.List;

public interface MenuService {
 Menu addMenu(Menu menu);
 List<Menu> findAllMenu();
 Menu getMenuById(String id);
 List<Menu> getMenuByCategory(String category);
 Menu updateMenu(Menu menu);
 String deleteMenuByMenuId(String menuId);

}
