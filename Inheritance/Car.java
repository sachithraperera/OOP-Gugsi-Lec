package Inheritance;

//access modifiers private ,public ,default and protected
public class Car extends Vehicle {
    private String carID;
    private String make;
    private String model;
    private int topSpeed;
    private int capacity;
    private int doors;
    private String transmission;

    //Constructor
    //parameters - passed within parenthesis
    //to give initial values to instances variable (attributes)
    public Car(String carID,
               String make,
               String model,
               int topSpeed,
               int capacity,
               int doors,
               String transmission){
        super(carID,make,model,topSpeed,capacity);
        //even if u didnt add
        //this line will be automatically added
        //we are calling superclass constructor
        //deafault constructor
        //this.carID=carID;
//        this.make=make;
//        this.model=model;
//        this.topSpeed=topSpeed;
//        this.capacity=capacity;
        this.doors=doors;
        this.transmission=transmission;

    }

    public String getCarID() {
        return carID;
    }

    public void setCarID(String carID) {
        this.carID = carID;
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

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }
}
