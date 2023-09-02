package org.thecloutengineer.decision_structure;

import java.util.Scanner;

public class GradeMessage {
    public static void main(String[] args) {
        System.out.println("Enter your letter grade");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        String message;

        switch (grade) {
            case "A": message = "Excellent Job"; break;

            case "B": message = "Good job"; break;

            case "C": message = "ok job"; break;

            case "D": message = "getting there, but you need to work harder"; break;

            case "F": message = "Uh oh! Please review the study guide"; break;
            default:
                throw new IllegalStateException("Unexpected value: " + grade);
        }

        System.out.println(message);
    }
}
