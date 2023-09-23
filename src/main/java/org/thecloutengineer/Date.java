package org.thecloutengineer;

public class Date {
    public static void main(String[] args) {
        String firstLine = "Hello, world!";
        System.out.println(firstLine);

        System.out.print("The value of the firstLine is: ");
        System.out.println(firstLine);

        int hour = 11;
        int minute = 59;
        System.out.print("The current line is ");
        System.out.print(hour);
        System.out.print(":");
        System.out.print(minute);
        System.out.print(".");
        System.out.println(" ");

        String day = "Saturday";
        String day_of_week = "14th";
        String currentMonth = "October";

        System.out.println("Khalil's Birthday is " + day + " " + currentMonth + " " + day_of_week);
    }
}
