package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest {

    public static final int size=10;
    public static void main(String[] args) {

        //what if i want to store 10 numbers

        //find the sum of the numbers and display the sum

        // step 01 create array with size 10
        int [] numbers = new int[size];

        //step 02 get 10 numbers and store them in the array

        Scanner sc = new Scanner(System.in);

        for(int i=0;i<numbers.length;i++){
            System.out.print("Enter the number for the index " + i +":" );
            numbers[i]=sc.nextInt();
        }
        //step 3
        int total=0;
        for(int num: numbers){
            System.out.println(num);
            total+=num;
        }
//        System.out.println("Numbers in the array " +numbers);
        System.out.println("Sum of all the numbers "+total);

        Arrays.sort(numbers);
        System.out.println("Printing after sorting");
        for(int num : numbers){
            System.out.println(num);
        }

    }
}

