import java.util.*;
public class CircleTest {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radius:");
        int radius = sc.nextInt();

        Circle obj=new Circle();
        obj.setRadius(radius);



        double area = obj.getArea();
        double cercumfernce = obj.getcercumfernce();


        System.out.println("Area is " + area);
        System.out.println("cercumfernce is " + cercumfernce);
    }
}