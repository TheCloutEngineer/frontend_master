package org.thecloutengineer.loops;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean again;

        do{
            System.out.println("Enter the first number");
            double num1 = sc.nextDouble();
            System.out.println("Enter the second number");
            double num2 = sc.nextDouble();
            System.out.println("Sum: " + (num1 + num2));
            System.out.println("Would you like to add numbers again? press false for no and true for yes");
            again = sc.nextBoolean();
        } while (again);
    }
}
