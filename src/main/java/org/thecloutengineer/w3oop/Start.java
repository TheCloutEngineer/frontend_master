package org.thecloutengineer.w3oop;

public class Start {
    public static void main(String[] args) {
        /**
         Write a Java program to create a class called "Person" with a name and age attribute.
         Create two instances of the "Person" class, set their attributes using the constructor,
         and print their name and age.
         */
        Person otto = new Person(19, "otto");
        Person mark = new Person(21, "mark");
        System.out.println(otto.getName() + " is " + otto.getAge() + " years old");
        System.out.println(mark.getName() + " is " + mark.getAge() + " years old");


        /**
        Write a Java program to create a class called "Dog" with a name and breed attribute.
        Create two instances of the "Dog" class, set their attributes using the constructor and
         modify the attributes using the setter methods and print the updated values.
         */
        Dog dog = new Dog("rex", "pit");
        Dog dog1 = new Dog("rudy", "bulldog");
        String p = ".";
        System.out.println(dog.getName() + " is a " + dog.getBreed() + p);
        System.out.println(dog1.getName() + " is a " + dog1.getBreed() + p);

        System.out.println("\nSet the new breed of dog1 and new name of dog2.");
        dog.setBreed("Labrador Retriever");
        dog1.setName("Daisy");
        System.out.println(dog.getName() + " is now a " + dog.getBreed());
        System.out.println(dog1.getName() + " is now a " + dog1.getBreed());

        /**
         * 3. Write a Java program to create a class called "Rectangle" with width and height attributes.
         * Calculate the area and perimeter of the rectangle.
         */
        /**
         * 4. Write a Java program to create a class called "Circle" with a radius attribute.
         * You can access and modify this attribute. Calculate the area and circumference of the circle.
         */

        /**
         * Write a Java program to create a class called "Book" with attributes for title, author, and ISBN, and
         * methods to add and remove books from a collection.
         */

        /**
         * 6. Write a Java program to create a class called "Employee" with a name, job title,
         * and salary attributes, and methods to calculate and update salary.
         */
        /**
         * 7. Write a Java program to create a class called "Bank" with a collection of accounts
         * and methods to add and remove accounts, and to deposit and withdraw money.
         * Also define a class called "Account" to maintain account details of a particular customer.
         */


    }
}
