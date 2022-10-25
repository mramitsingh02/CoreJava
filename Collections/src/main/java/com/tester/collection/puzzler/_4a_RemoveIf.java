package com.tester.collection.puzzler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class _4a_RemoveIf {
    public static void main(String[] args) {

        String [] ints = {"a", "b", "c", null};

        var strings1 = Arrays.asList(ints);
        strings1.removeIf(Objects::isNull);
        System.out.println(strings1.size());

        //Options
        //1. 4
        //2. 3
        //3. Neither of these
    }

    //Answer
    // 3
    // UnsupportedOperationException

}
