package com.docsconsole.tutorials.operations.toarray;

import java.util.Arrays;

public class StreamsExample {
    public static void main(String[] args) {

        //convert the stream as array
        Object[] strArray = Arrays.asList("eeeee", "bb", "ccc", "dddd", "a")
                .stream().toArray();
        Arrays.stream(strArray).forEach(System.out::println);


    }
}
