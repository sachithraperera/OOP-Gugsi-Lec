package Inheritance;

public class Plane extends Vehicle {
    private double wingSpan;
    private double minRunRate;

    public Plane(
            String vehicleID,
            String make,
            String model,
            int topSpeed,
            int capacity,
            double wingSpan,
            double minRunRate
    ){
        super(vehicleID,make,model,topSpeed,capacity);
        this.wingSpan=wingSpan;
        this.minRunRate=minRunRate;
    }

    public double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }

    public double getMinRunRate() {
        return minRunRate;
    }

    public void setMinRunRate(double minRunRate) {
        this.minRunRate = minRunRate;
    }
}
