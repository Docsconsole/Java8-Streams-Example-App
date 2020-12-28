package com.docsconsole.tutorials.basics;

import java.util.Arrays;
import java.util.List;

public class StreamsExample {
    public static void main(String[] args) {
        // Basic example of Streams
        List<String> monthList =
                Arrays.asList("jan", "feb", "mar", "apr", "may");

        monthList
                .stream()
                .filter(s -> s.endsWith("r"))
                .forEach(System.out::println);
    }
}
