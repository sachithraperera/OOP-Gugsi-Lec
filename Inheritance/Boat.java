package Inheritance;

public class Boat extends Vehicle {
    private String boatID;
    private String make;
    private String model;
    private int topSpeed;
    private int capacity;
    private String hulMaterial;
    private int minDepth;

    public Boat(String boatID,
               String make,
               String model,
               int topSpeed,
               int capacity,
                String hulMaterial,
               int minDepth
               ) {
        super(boatID,make,model,topSpeed,capacity);
//        this.boatID =boatID;
//        this.make = make;
//        this.model = model;
//        this.topSpeed = topSpeed;
//        this.capacity = capacity;
        this.hulMaterial =hulMaterial;
        this.minDepth = minDepth;
    }

    public String getBoatID() {
        return boatID;
    }

    public void setBoatID(String boatID) {
        this.boatID = boatID;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getHulMaterial() {
        return hulMaterial;
    }

    public void setHulMaterial(String hulMaterial) {
        this.hulMaterial = hulMaterial;
    }

    public int getMinDepth() {
        return minDepth;
    }

    public void setMinDepth(int minDepth) {
        this.minDepth = minDepth;
    }
}
