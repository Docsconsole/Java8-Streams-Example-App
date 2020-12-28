package com.docsconsole.tutorials.streamsconstruct;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {

        //Different way of Streams creation
        Arrays.asList("jan", "feb", "mar", "apr", "may").stream().findFirst().ifPresent(System.out::println);
        Stream.of("jan", "feb", "mar", "apr", "may").findFirst().ifPresent(System.out::println);

        //on Arrays
        Arrays.stream(new String[]{"jan", "feb", "mar", "apr", "may"}).findFirst().ifPresent(System.out::println);
        IntStream.range(1, 11).forEach(System.out::println);
    }
}
