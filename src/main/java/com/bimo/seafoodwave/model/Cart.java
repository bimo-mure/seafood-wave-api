package com.bimo.seafoodwave.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "cart")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cart {
    private String menuId;
    private String menuName;
    private String choisesOfDhises;
    private Integer quantity;
    private Integer unitPrice;
    private Integer totalPrice;
}
