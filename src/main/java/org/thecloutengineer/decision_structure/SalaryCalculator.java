package org.thecloutengineer.decision_structure;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
       double salary = 1000;
       double bonus = 200;
       int quota = 10;

        System.out.println("How many sales did the employee" +
                " get this week?");
        Scanner sc = new Scanner(System.in);

        int sales = sc.nextInt();

        if (sales > quota) {
            salary = salary + bonus;
        }

        System.out.println("Salary: " + salary);

    }
}
