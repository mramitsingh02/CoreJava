package com.tester.collection.puzzler;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class _3a_HandlingNull {
    public static void main(String[] args) {

        var ints = new ArrayList<>(List.of("a", "b", "c", null));

        var strings1 = Stream.of(ints).toList();
        System.out.println(strings1.size());

        var strings2 = List.of(ints);
        System.out.println(strings2.size());

        //Options
        //1. 4 3
        //2. 4 4
        //3. 3 4
        //4. None of these
    }

    //Answer
    // 4
    // NullPointerException (null value is not accepted by )

}
