/*
This problem was asked by Uber.
Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.
For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].
Follow-up: what if you can't use division?
*/

import java.util.Scanner;

public class Problem2 {

    private int[] inputs;
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Problem2 problem2 = new Problem2();
        problem2.parseInputs();
        problem2.print(problem2.getProductArray());
    }

    private void parseInputs() {
        int noOfElements = scanner.nextInt();
        inputs = new int[noOfElements];

        int counter;
        for (counter = 0 ; counter < noOfElements ; counter++) {
            inputs[counter] = scanner.nextInt();
        }
    }

    private long[] getProductArray() {

        long[] products = new long[inputs.length];

        int counter1, counter2;
        for (counter1 = 0 ; counter1 < inputs.length ; counter1++) {
            products[counter1] = 1;

            for (counter2 = 0 ; counter2 < inputs.length ; counter2++) {
                if (counter1 != counter2) {
                    products[counter1] *= inputs[counter2];
                }
            }
        }

        return products;
    }

    private void print(long[] productArray) {
        int counter;
        for (counter = 0 ; counter < productArray.length ; counter++) {
            System.out.print(productArray[counter] + " ");
        }
    }
}
