/*
This problem was recently asked by Google.
Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
Bonus: Can you do this in one pass?
*/

import java.util.Scanner;

public class Problem1 {

    private Scanner scanner = new Scanner(System.in);
    private int[] inputs;
    private int target;

    public static void main(String[] args) {

        Problem1 problem1 = new Problem1();
        problem1.parseInputs();

        if (problem1.isTargetExists()) {
            System.out.println("Found");
        } else {
            System.out.println("Not found");
        }

    }

    private void parseInputs() {

        String arrayLine = scanner.nextLine();
        String[] numbers = arrayLine.split(",");

        inputs = new int[numbers.length];

        int cou;
        for (cou = 0 ; cou < numbers.length; cou++) {
            try {
                inputs[cou] = Integer.parseInt(numbers[cou].replaceAll("\\s+",""));
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }

        target = scanner.nextInt();
    }

    private boolean isTargetExists() {

        int cou1, cou2;

        for (cou1 = 0 ; cou1 < inputs.length; cou1++) {

            for (cou2 = 0 ; cou2 < inputs.length; cou2++) {
                if (cou1 != cou2 && target == (inputs[cou1] + inputs[cou2])) {
                    return true;
                }
            }
        }

        return false;
    }
}
