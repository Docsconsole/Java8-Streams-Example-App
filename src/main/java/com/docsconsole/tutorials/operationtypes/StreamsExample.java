package com.docsconsole.tutorials.operationtypes;

import java.util.stream.Stream;

public class StreamsExample {
    public static void main(String[] args) {
        //intermediate operation will not be called here
        Stream.of("a1", "aa2", "aaa3", "aaaa4", "aaaaa5")
                .filter(s -> {
                    System.out.println("filter1: " + s);
                    return true;
                });

        //intermediate operation will be called here
        Stream.of("a1", "aa2", "aaa3", "aaaa4", "aaaaa5")
                .filter(s -> {
                    System.out.println("filter2: " + s);
                    return true;
                })
                .forEach(s -> System.out.println("forEach: " + s));
    }
}
