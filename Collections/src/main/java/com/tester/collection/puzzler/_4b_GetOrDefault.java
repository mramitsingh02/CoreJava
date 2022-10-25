package com.tester.collection.puzzler;

import java.util.HashMap;
import java.util.Map;

public class _4b_GetOrDefault {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, null);

        System.out.print(map.getOrDefault(1, "one") + " ");

        map.putIfAbsent(1, "one");
        System.out.println(map.get(1));

        //Options
        //1. one null
        //2. null one
        //3. null null
        //4. None of these
    }

    //Answer
    // 2
    // null, one

}
