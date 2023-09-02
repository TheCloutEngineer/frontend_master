package org.thecloutengineer.calculator;

import java.util.Scanner;

public class GrossPay {
    public static void main(String[] args) {
        System.out.println("How many how many hours did you work?");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        System.out.println("What is your hourly pay rate");
        double rate = scanner.nextDouble();
        scanner.close();

        double payRate = hours * rate;

        System.out.println("Gross pay rate: " + payRate);

    }
}
