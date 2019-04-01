package com.jigar.warehouse.model;

import com.google.gson.annotations.Expose;

public class Vehicle {

    @Expose
    private String name;

    @Expose
    private String location;

    @Expose
    private String time_to_home;

    public Vehicle(String name, String location, String time_to_home) {
        this.name = name;
        this.location = location;
        this.time_to_home = time_to_home;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTime_to_home() {
        return time_to_home;
    }

    public void setTime_to_home(String time_to_home) {
        this.time_to_home = time_to_home;
    }
}
