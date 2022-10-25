package com.tester.collection.puzzler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _4d_MultiMap {
    public static void main(String[] args) {

        var numbers = List.of(1, 0, 1);

        Map<Integer, List<Integer>> map = new HashMap<>();

        numbers.forEach(number -> map.computeIfAbsent(number, ArrayList::new).add(number));

        System.out.println(map.get(0));
        System.out.println(map);

        //Options
        //1. null
        //2. [0]
        //3. Neither of these
    }

    //Answer
    // 3
    // java.lang.IllegalArgumentException: Illegal Capacity: -1

}
