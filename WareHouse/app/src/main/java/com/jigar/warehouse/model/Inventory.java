package com.jigar.warehouse.model;

import com.google.gson.annotations.Expose;

public class Inventory {

    @Expose
    private String item;

    @Expose
    private String quantity;

    @Expose
    private String location;


    public Inventory(String item, String quantity, String location) {
        this.item = item;
        this.quantity = quantity;
        this.location = location;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
