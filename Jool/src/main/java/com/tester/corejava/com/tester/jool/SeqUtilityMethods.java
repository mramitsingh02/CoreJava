package com.tester.corejava.com.tester.jool;

import org.jooq.lambda.Seq;

public class SeqUtilityMethods {
    public static void main(String[] args) {
        //Filter example
        Seq<Integer> seq = Seq.range(1, 5);
        seq.filter(number -> number < 3)
                .forEach(System.out::println);

        System.out.println("_____________1___________________");
        //Cycle
        // (1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, ...)
        Seq.range(1, 4).cycle(3)
                .forEach(System.out::println);

        System.out.println("______________2__________________");
        //groupBy
        // (tuple(1, (1, 3)), tuple(0, (2, 4)))
        Seq.range(1, 8).groupBy(i -> i % 2)
                .forEach((key,value)-> {
                    System.out.println(key +", "+value);
                });

        System.out.println("_______________3_________________");
        //join
        String string = Seq.of(1, 2, 3, 4).toString(", ");
        System.out.println(string);
        System.out.println("_______________4_________________");

    }
}
