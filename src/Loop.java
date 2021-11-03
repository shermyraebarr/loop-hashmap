//Write a program that:
//Asks for 5 nums
//Stores them in an array list
// Finds sum, product, largest and smallest nums

import java.util.Scanner;
import java.util.ArrayList;

public class Loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> array = new ArrayList<>();

        System.out.println("Enter 5 numbers: ");

        for (int i=0; i < 5; i++) {
            array.add(input.nextInt());

        }
        System.out.println("Your numbers are: " + array);
        System.out.println("The sum of your numbers are: " + findSum(array));
        System.out.println("The product of the array is: " + findProduct(array));
        System.out.println("The largest number in the array is: " + findLargest(array));
        System.out.println("The smallest number is: " + findSmallest(array));

        input.close();
        
    }
    public static int findSum(ArrayList<Integer> array) {
        int sum =0;

        for (int i =0; i < array.size(); i++) {
            sum += array.get(i);
        }
        return sum;
    }
    public static int findProduct(ArrayList<Integer> array) {
        int product = 1;

        for (int i =0; i < array.size(); i++) {
            product *= array.get(i);
        }
        return product;
    }

    public static int findLargest(ArrayList<Integer> array) {
        int largest = 0;

        for (int i=0; i < array.size(); i++) {
            if (largest < array.get(i))
            largest = array.get(i);
        }
        return largest;
    }

    public static int findSmallest(ArrayList<Integer> array) {
            int small = 1;

            for (int i=0; i < array.size(); i++) {
                if (small > array.get(i))
                small = array.get(i);
            }
            return small;
    }
}
