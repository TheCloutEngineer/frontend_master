package org.thecloutengineer.methods;

import java.util.Scanner;

public class GreetUser {
    public static void main(String[] args) {

        String name = getUserName();
        greetUserFromName(name);

        greeter();
        greetUser();
    }

    public static void greetUserFromName(String name) {
        System.out.println("Greetings, " + name + "!");
    }

    public static String getUserName() {
        System.out.println("Enter your name");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        sc.close();
        return name;
    }

    public static void greeter() {
        System.out.println("Hello Friend, what is your name?");
    }
    public static void greetUser() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Welcome to the Philadelphia " + name + "!");
        scanner.close();
    }
}
