public class Rectangle {

    private double length;
    private double width;
    private static int objCounter;//static variable-one copy per class

    //Condtructor name should be class name
    //Condtructor doesnt have a return type not valid
    //deafult constructor will appear in case u dont make it

//initialiser
    public Rectangle(double length,double width){
        super();
        this.setLength(length);
        this.setWidth(width);
        objCounter++; //when try to acces static varible u have to go through ur main method like wih dot
    }

    public static int getObjCounter(){//noparameters since we getting values
        return objCounter; // are there any instsnce varible no ryt??

        //when to go for a staic or instance
    }

    public double getLength(){// at what stage we have to give the parameters
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }

    public void setLength(double length){
        if(length>0) {
            this.length = length;
        }else{
            throw new IllegalArgumentException("Length has to be grater than 0");
        }
    }
    public void setWidth(double width){
        if(width>0) {
            this.width = width;
        }else {
            throw new IllegalArgumentException("Width has to be greater than 0");
        }
    }

    public  double getArea(){
        return length * width;
    }
}

