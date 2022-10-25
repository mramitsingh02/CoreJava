package com.tester.collection.puzzler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _4c_MultiMap {
    public static void main(String[] args) {

        var numbers = List.of(-1, 0, 1);

        Map<Integer, List<Integer>> map = new HashMap<>();

        numbers.forEach(number -> map.putIfAbsent(number, new ArrayList<>()).add(number));

        System.out.println(map.get(0));

        //Options
        //1. null
        //2. [0]
        //3. Neither of these
    }

    //Answer
    // 3
    // NullPointerException ("java.util.List.add(Object)" because the return value of "java.util.Map.putIfAbsent(Object, Object)" is null)

}
