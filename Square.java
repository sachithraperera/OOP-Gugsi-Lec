import java.util.Scanner;
public class Square {
    //cercumfernce
    //area

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Height : ");
        double height= sc.nextDouble();

        System.out.print("Enter the Length : ");
        double length= sc.nextDouble();

        SquareSec S = new SquareSec();
        S.setHeight(height);
        S.setLength(length);

        double cercumfernce=S.getCercumfernce();
        double area=S.getArea();

        System.out.println("Cercumfernce is " + cercumfernce);
        System.out.println("Area is " + area);
    }
    /*
    public static double getCercumfernce(double height,double length){
        return height+length;
    }
    public static double getArea(double height,double length){
        return height*length;
    }*/

}
