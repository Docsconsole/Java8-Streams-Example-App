package com.docsconsole.tutorials.operations.foreach;

import java.util.Arrays;

public class StreamsExample {
    public static void main(String[] args) {

        //display the alphabets in sorting order
        Arrays.asList("eeeee", "bb", "ccc", "dddd", "a")
                .stream().sorted()
                .forEach(System.out::println);

        //display the numbers in sorting order
        Arrays.asList("102", "103", "105", "101", "104")
                .stream().sorted()
                .forEach(System.out::println);

        //display the strings with foreach
        Arrays.asList("www", ".", "docsconsole", ".", "com")
                .stream()
                .forEach(System.out::print);
    }
}
