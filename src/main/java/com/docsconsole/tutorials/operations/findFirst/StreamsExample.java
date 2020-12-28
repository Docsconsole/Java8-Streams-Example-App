package com.docsconsole.tutorials.operations.findFirst;

import java.util.Arrays;
import java.util.Comparator;

public class StreamsExample {
    public static void main(String[] args) {

        //display the even numbers from a list
        Arrays.asList(1, 2, 3, 7, 8, 9, 10, 12)
                .stream()
                .sorted(Comparator.reverseOrder())
                .findFirst().ifPresent(System.out::println);


    }
}
