package com.henz.kitchen.simulator.entities;

import java.util.List;

public class Product {

    private Long id;

    private String name;

    private double price;

    private ProductType type;

    private List<Item> ingredients;

    public Product() {
    }

    public Product(String name, double price, ProductType type, List<Item> ingredients) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.ingredients = ingredients;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ProductType getType() {
        return type;
    }

    public void setType(ProductType type) {
        this.type = type;
    }

    public List<Item> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Item> ingredients) {
        this.ingredients = ingredients;
    }
}
