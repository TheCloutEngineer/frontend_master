package org.thecloutengineer.variableScope;

import java.util.Scanner;

public class CreditCheck {

    static double requiredSalary = 25_000;
    static int requireCreditScore = 700;
    static Scanner scanner = new Scanner(System.in) ;
    public static void main(String[] args) {

        double salary = getSalary();

        int creditScore = getCreditScore();
        scanner.close();

        boolean qualified = isUserQualified(salary, creditScore);
        
        notifyUser(qualified);
    }

    private static void notifyUser(boolean qualified) {
        if (qualified) System.out.println("Congrats you been approve!!");
        else System.out.println("Sorry, you been delcine");
    }

    public static boolean isUserQualified(double salary, int creditScore) {
        return (salary >= requiredSalary) && (creditScore >= requireCreditScore);
    }

    private static double getSalary() {
        System.out.println("Enter your salary?");
        return scanner.nextDouble();
    }

    private static int getCreditScore() {
        System.out.println("Enter your score");
        int creditScore = scanner.nextInt();
        return creditScore;
    }
}
