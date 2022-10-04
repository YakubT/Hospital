package com.solvd.hospital.models.classes;

import com.solvd.hospital.models.enums.TypeOfService;

public class Service {

    private int id;

    private String name;

    private TypeOfService type;

    private double price;

    public Service() {

    }

    public Service(int id, String name, TypeOfService type,double price) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TypeOfService getType() {
        return type;
    }

    public void setType(TypeOfService type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
