package Array;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class setTest {
    public static void main(String[] args) {
//        Set<Integer> set = new HashSet<>();
//
//        System.out.println(set.add(10));
//        System.out.println(set.add(10));
//        System.out.println(set.add(10));
//        System.out.println(set.add(10));
//        System.out.println(set);
//        set.add(25);
//        set.add(250);
//        set.add(2512);
//        System.out.println(set); //doesnt maintain insertion order

// to sort insertion
        System.out.println("Tree set");
        Set<Integer> set1 = new TreeSet<>();

        System.out.println(set1.add(10));
        System.out.println(set1.add(10));
        System.out.println(set1.add(10));
        System.out.println(set1.add(10));
        System.out.println(set1);
        set1.add(25);
        set1.add(250);
        set1.add(2512);
        System.out.println(set1); // maintain the structure
    }
}
