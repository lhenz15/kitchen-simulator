package com.henz.kitchen.simulator.entities;

import java.time.ZonedDateTime;

public class Order {

    private Long id;

    private ZonedDateTime date;

    private OrderStatus orderStatus;

    private OrderDetail orderDetail;

    private String customer;

    private OrderPayment orderPayment;

    public Order() {
    }

    public Order(ZonedDateTime date, OrderStatus orderStatus, OrderDetail orderDetail, String customer, OrderPayment orderPayment) {
        this.date = date;
        this.orderStatus = orderStatus;
        this.orderDetail = orderDetail;
        this.customer = customer;
        this.orderPayment = orderPayment;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public ZonedDateTime getDate() {
        return date;
    }

    public void setDate(ZonedDateTime date) {
        this.date = date;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public OrderDetail getOrderDetail() {
        return orderDetail;
    }

    public void setOrderDetail(OrderDetail orderDetail) {
        this.orderDetail = orderDetail;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public OrderPayment getOrderPayment() {
        return orderPayment;
    }

    public void setOrderPayment(OrderPayment orderPayment) {
        this.orderPayment = orderPayment;
    }
}
