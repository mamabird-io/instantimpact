package com.jigar.warehouse.model;

import com.google.gson.annotations.Expose;

public class Order {

    @Expose
    private int id;

    @Expose
    private String location;

    @Expose
    private String items;

    @Expose
    private String container;

    @Expose
    private String vehicle;

    public Order(int id, String location, String items, String container, String vehicle) {
        this.id = id;
        this.location = location;
        this.items = items;
        this.container = container;
        this.vehicle = vehicle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }

    public String getContainer() {
        return container;
    }

    public void setContainer(String container) {
        this.container = container;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }
}
