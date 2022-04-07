package com.henz.kitchen.simulator.entities;

import java.util.List;

public class Inventory {

    private Long id;

    private List<InventoryItem> inventoryItems;

    public Inventory() {
    }

    public Inventory(List<InventoryItem> inventoryItems) {
        this.inventoryItems = inventoryItems;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<InventoryItem> getInventoryItems() {
        return inventoryItems;
    }

    public void setInventoryItems(List<InventoryItem> inventoryItems) {
        this.inventoryItems = inventoryItems;
    }
}
