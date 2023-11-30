package com.bimo.seafoodwave.service.impl;

import com.bimo.seafoodwave.model.Menu;
import com.bimo.seafoodwave.repository.MenuRepository;
import com.bimo.seafoodwave.service.MenuService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    private MenuRepository repository;
    public Menu addMenu(Menu menu){
        return repository.save(menu);
    }

    public List<Menu> findAllMenu(){
        return repository.findAll();
    }

    public Menu getMenuById(String id) {
        return repository.findMenuByMenuId(id);
    }

    public List<Menu> getMenuByCategory(String category){
        return repository.findByCategory(category);
    }

    public Menu updateMenu(Menu menu){
        Menu exsistingMenu = repository.findMenuByMenuId(menu.getMenuId());
        exsistingMenu.setName(menu.getName());
        exsistingMenu.setCategory(menu.getCategory());
        exsistingMenu.setImageUrl(menu.getImageUrl());
        exsistingMenu.setSoldOut(menu.getSoldOut());
        exsistingMenu.setUnitPrice(menu.getUnitPrice());
        exsistingMenu.setChooseOfDishes(menu.getChooseOfDishes());
        return repository.save(exsistingMenu);
    }

    public String deleteMenuByMenuId(String menuId) {
        repository.deleteMenuByMenuId(menuId);
        return "Menu has been deleted";
    }


}
