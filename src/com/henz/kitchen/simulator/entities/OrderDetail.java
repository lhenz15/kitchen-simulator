package com.henz.kitchen.simulator.entities;

import java.util.List;

public class OrderDetail {

    private Long id;

    private List<Product> products;

    private List<OrderTax> orderTaxes;

    private OrderComplexity orderComplexity;

    public OrderDetail() {
    }

    public OrderDetail(List<Product> products, List<OrderTax> orderTaxes, OrderComplexity orderComplexity) {
        this.products = products;
        this.orderTaxes = orderTaxes;
        this.orderComplexity = orderComplexity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<OrderTax> getOrderTaxes() {
        return orderTaxes;
    }

    public void setOrderTaxes(List<OrderTax> orderTaxes) {
        this.orderTaxes = orderTaxes;
    }

    public OrderComplexity getOrderComplexity() {
        return orderComplexity;
    }

    public void setOrderComplexity(OrderComplexity orderComplexity) {
        this.orderComplexity = orderComplexity;
    }
}
