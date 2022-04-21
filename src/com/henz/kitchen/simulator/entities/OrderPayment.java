package com.henz.kitchen.simulator.entities;

public class OrderPayment {

    private Long id;

    private Double amount;

    public OrderPayment() {
    }

    public OrderPayment(Double amount) {
        this.amount = amount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
