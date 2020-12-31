package com.docsconsole.tutorials.operations.map;

import java.util.Arrays;

public class StreamsExample {
    public static void main(String[] args) {

        //result with map
        Arrays.asList("red", "blue", "green", "yellow", "white", "back")
                .stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        Arrays.asList(1,2,3,4,5)
                .stream()
                .map(s -> s * 5)
                .forEach(System.out::println);
    }
}
