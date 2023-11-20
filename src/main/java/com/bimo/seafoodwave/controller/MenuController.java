package com.bimo.seafoodwave.controller;

import com.bimo.seafoodwave.model.Menu;
import com.bimo.seafoodwave.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RequestMapping("/menu")
@RestController
public class MenuController {

    @Autowired(required = true)
    private MenuService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Menu createMenu(@RequestBody Menu menu){
        return service.addMenu(menu);
    }

    @GetMapping
    public List<Menu> getMenu() {
        return service.findAllMenu();
    }

    @GetMapping("/{menuId}")
    public Menu getMenuById(@PathVariable String menuId){
        return service.getMenuById(menuId);
    }

    @GetMapping("/category/{category}")
    public List<Menu>  getMenuByCategory(@PathVariable String category){
        return service.getMenuByCategory(category);
    }

    @PutMapping
    public Menu modifyMenu(@RequestBody Menu menu){
        return service.updateMenu(menu);
    }

    @DeleteMapping("/{menuId}")
    public String deleteMenu(@PathVariable String menuId){
        return service.deleteMenuByMenuId(menuId);
    }

}
