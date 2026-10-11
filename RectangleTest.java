import java.util.Scanner;
public class RectangleTest {
    static void main(String[] args) {
        //Rectangle() - call to the constructor
        //Rectangle() contrcutor initialize the obj


        System.out.println("The no of rectangle object " + Rectangle.getObjCounter());

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Length = ");
        double length = sc.nextDouble();

        System.out.println("Enter the Width = ");
        double width= sc.nextDouble();

        Rectangle obj = new Rectangle(length,width);

        System.out.println("The Length is = "+obj.getLength());
        System.out.println("The Width is = "+obj.getWidth());

        System.out.println("Enter the new Length = ");
        double newLength=sc.nextDouble();
        obj.setLength(newLength);
        System.out.println("Enter the new Width = ");
        double newWidth=sc.nextDouble();
        obj.setWidth(newWidth);

        System.out.println("Area is = "  + obj.getArea());

    }
}
