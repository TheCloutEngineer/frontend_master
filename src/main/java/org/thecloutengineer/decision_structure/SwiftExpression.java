package org.thecloutengineer.decision_structure;

import java.util.Scanner;

public class SwiftExpression {
    public static void main(String[] args) {
        System.out.println("Enter your letter grade");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        String message = switch (grade) {
            case "A" -> "Excellent Job";
            case "B" -> "Good job";
            case "C" -> {
                yield "ok job";
            }
            case "D" -> "getting there, but you need to work harder";
            case "F" -> "Uh oh! Please review the study guide";
            default -> throw new IllegalStateException("Unexpected value: " + grade);
        };

        System.out.println(message);
    }
}
