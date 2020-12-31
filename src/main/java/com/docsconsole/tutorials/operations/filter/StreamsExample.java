package com.docsconsole.tutorials.operations.filter;

import java.util.Arrays;

public class StreamsExample {
    public static void main(String[] args) {

        //display the even numbers from a list
        Arrays.asList(1, 2, 3, 7, 8, 9, 10, 12)
                .stream().filter(e -> {
            return e % 2 != 0;
        })
                .forEach(System.out::println);


    }
}
