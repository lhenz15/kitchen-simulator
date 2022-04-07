package com.henz.kitchen.simulator.entities;

import java.util.List;

public class Menu {

    private Long id;

    private String name;

    private MenuType type;

    private List<Product> products;

    public Menu() {
    }

    public Menu(String name, MenuType type, List<Product> products) {
        this.name = name;
        this.type = type;
        this.products = products;
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

    public MenuType getType() {
        return type;
    }

    public void setType(MenuType type) {
        this.type = type;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
