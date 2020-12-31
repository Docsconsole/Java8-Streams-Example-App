package com.docsconsole.tutorials.ordering;

import java.util.stream.Stream;

public class StreamsExample {
    public static void main(String[] args) {

        /*Stream.of("a1","bb2", "ccc3", "cccc4", "eeeee5", "eeeeee6")
                .filter(s -> {
                    System.out.println("filter: " + s);
                    return true;
                })
                .forEach(s -> System.out.println("forEach: " + s));*/


        /*Stream.of("a1","bb2", "ccc3", "cccc4", "eeeee5", "eeeeee6")
                .map(s -> {
                    System.out.println("map: " + s);
                    return  true;
                })
               .anyMatch(s->{
                   System.out.println("anyMatch: " + s);
                   return  true;
               });*/

        /*Stream.of("a1","bb2", "ccc3", "cccc4", "eeeee5", "eeeeee6")
                .map(s -> {
                    System.out.println("map: " + s);
                    return s.toUpperCase();
                })
                .filter(s->{
                    System.out.println("filter: " + s);
                    return s.startsWith("C");
                })
               .forEach(s->{
                   System.out.println("forEach: " + s);
               });*/

        /*Stream.of("a1","bb2", "ccc3", "cccc4", "eeeee5", "eeeeee6")
                .sorted((s1, s2) -> {
                    System.out.printf("sort: %s; %s\n", s1, s2);
                    return s1.compareTo(s2);
                })
                .map(s -> {
                    System.out.println("map: " + s);
                    return s.toUpperCase();
                })
                .filter(s->{
                    System.out.println("filter: " + s);
                    return s.startsWith("C");
                })
                .forEach(s->{
                    System.out.println("forEach: " + s);
                });*/
        Stream.of("a1", "bb2", "ccc3", "cccc4", "eeeee5", "eeeeee6")
                .filter(s -> {
                    System.out.println("filter: " + s);
                    return s.startsWith("C");
                })
                .sorted((s1, s2) -> {
                    System.out.printf("sort: %s; %s\n", s1, s2);
                    return s1.compareTo(s2);
                })
                .map(s -> {
                    System.out.println("map: " + s);
                    return s.toUpperCase();
                })

                .forEach(s -> {
                    System.out.println("forEach: " + s);
                });

    }

}
