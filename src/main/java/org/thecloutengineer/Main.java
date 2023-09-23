package org.thecloutengineer;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        HashMap<Integer, String> strings = new HashMap<>();

        strings.put(1, "String");
        strings.put(2, "String2");
        strings.put(3, "String3");
        strings.put(4, "String4");
//        strings.put(5, "String5");

        String randomText = """
                This is a text
                that spans
                multiple lines""";

        System.out.println(randomText);
        System.out.println(strings);

        System.out.println(strings.get(1).toUpperCase());
    }
}