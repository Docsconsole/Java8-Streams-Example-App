package com.docsconsole.tutorials.operations.collect;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StreamsExample {
    public static void main(String[] args) {

        //display the even numbers from a list
        Arrays.asList(100, 200, 201, 302, 403, 505)
                .stream().filter(s -> {
            return s % 2 == 0;
        }).collect(Collectors.toList())
                .forEach(System.out::println);


    }
}
