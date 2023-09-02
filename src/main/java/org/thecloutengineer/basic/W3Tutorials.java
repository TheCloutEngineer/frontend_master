package org.thecloutengineer.basic;

import java.util.Arrays;
import java.util.Scanner;

public class W3Tutorials {

    /**
     * Write a Java method to find the smallest number among three numbers.
     *
     * Test Data:
     * Input the first number: 25
     * Input the Second number: 37
     * Input the third number: 29
     * @param args
     */
    public static void main(String[] args) {


        System.out.println("Hey the smallest number is "+ findSmallestNumbers(72, 55, 93));
        Scanner in = new Scanner(System.in);
        System.out.println("input the first ");
        findTheAverageNumber();
    }

    private static int findSmallestNumbers(int num1, int num2, int num3) {
        int[] numbers = new int[3];
        numbers[0] = num1;
        numbers[1] = num2;
        numbers[2] = num3;
        int[] smallestNum = Arrays.stream(numbers).min().stream().toArray();
        return smallestNum[0];
    }

    private static void findTheAverageNumber() {
    }
}
