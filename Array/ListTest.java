package Array;

import java.sql.SQLOutput;
import java.util.*;

public class ListTest {

    private static final int size = 10;
    public static void main(String[] args) {
        //how to create an array List?
        //Programming to super type

//        List numbers = new ArrayList<>(); // raw type
//        numbers.add(10);
//        numbers.add(25.8);
//        numbers.add("Yehan");
//        numbers.add(new Scanner(System.in));

        List<Object> objects = new ArrayList<>();
        objects.add(10);
        objects.add(25.8);
        objects.add("Yehan");
        objects.add(new Scanner(System.in));

        //type saftey
        List<Integer> numbers = new LinkedList<Integer>();

        //onli integers
        //JCF supports only objects
        //So does Generics support only object

        // List <int> nums = new ArrayList<>(); // for all the primitive data type we have wrapper type
        // Generics doesn't support primitive data type
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < size; i++) {
            System.out.print("Enter the number for the index " + i + ":");
            numbers.add(sc.nextInt());
        }
        System.out.println("Before Sorting");
        // how to sort the list numbers
        Collections.sort(numbers); //collection is a interface
        //collections is a utility class

        System.out.println("After sorting " + numbers);
        System.out.println("After sorting " + numbers);
    }
}
