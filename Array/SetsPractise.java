package Array;

import java.util.HashSet;
import java.util.Set;

public class SetsPractise {
    static void main(String[] args) {

        Set<Integer> numbers = new HashSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(10); // Duplicate

        System.out.println(numbers);
    }
}
