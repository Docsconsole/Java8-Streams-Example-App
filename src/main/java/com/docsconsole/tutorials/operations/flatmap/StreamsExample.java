package com.docsconsole.tutorials.operations.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsExample {
    public static void main(String[] args) {

        //result with map
        List colors = Stream.of(Arrays.asList("red", "blue", "green"), Arrays.asList("yellow", "white", "back"))
                .map(List::stream)
                .collect(Collectors.toList());

        System.out.println(colors);
        //result with flatMap
        List colors1 = Stream.of(Arrays.asList("red", "blue", "green"), Arrays.asList("yellow", "white", "back"))
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println(colors1);


    }
}
