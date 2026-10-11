public class Circle{

    private double radius;

    public Circle(){
        super();
        this.radius=0.0;
    }

    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        if (radius >0){
            this.radius=radius;
        }else{
            throw new IllegalArgumentException("Invalid Radius");
        }
    }


    public double getArea(){
        return Math.PI*this.radius*this.radius;
    }
    public double getcercumfernce(){
        return Math.PI*2*this.radius;
    }
}
