package com.example;

public class Bike {
    private int bikeId;
    private String type;
    private String brand;
    private String model;
    private boolean isAvailable;

    public Bike(int bikeId, String type, String brand, String model, boolean isAvailable) {
        this.bikeId = bikeId;
        this.type = type;
        this.brand = brand;
        this.model = model;
        this.isAvailable = isAvailable;
    }

    // Getters and Setters
    public int getBikeId() {
        return bikeId;
    }

    public void setBikeId(int bikeId) {
        this.bikeId = bikeId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}

