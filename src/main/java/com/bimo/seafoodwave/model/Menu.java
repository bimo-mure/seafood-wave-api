package com.bimo.seafoodwave.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;
import org.bson.types.ObjectId;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "menu")
public class Menu {
    @Id
    private String menuId;
    private String name;
    private Integer unitPrice;
    private String imageUrl;
    private List<String> choiseOfDhises;
    private String category;
    private Boolean soldOut;
}
