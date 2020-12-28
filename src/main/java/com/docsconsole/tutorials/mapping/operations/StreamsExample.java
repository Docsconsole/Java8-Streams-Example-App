package com.docsconsole.tutorials.mapping.operations;

import java.util.Arrays;

public class StreamsExample {
    public static void main(String[] args) {

        //map length to mapToInt
        Arrays.asList("a", "aa", "aaa", "aaaa", "aaaaa")
                .stream().mapToInt(s -> s.length())
                .forEach(System.out::println);

        //map length to Floats
        Arrays.asList("a", "aa", "aaa", "aaaa", "aaaaa")
                .stream().mapToInt(s -> s.length()).mapToObj(Float::new).forEach(System.out::println);

        //map length to formatted Strings
        Arrays.asList("a", "aa", "aaa", "aaaa", "aaaaa")
                .stream().mapToInt(s -> s.length()).mapToObj(l -> "length: " + l).forEach(System.out::println);
    }
}
