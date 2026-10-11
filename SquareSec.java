public class SquareSec {

    public SquareSec(){
        super();
        this.height=0.0;
        this.length=0.0;
    }

    private double height;
    private double length;

    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height=height;
    }
    public double getLength(){
        return length;
    }

    public void setLength(double length){
        this.length=length;
    }
    public double getCercumfernce(){
        return height+length;
    }
    public double getArea(){
        return height*length;
    }


}
