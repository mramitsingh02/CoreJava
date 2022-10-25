package com.tester.collection.puzzler;

import java.util.IdentityHashMap;
import java.util.LinkedHashMap;

public class _7a_LinkHashMap {
    public static void main(String[] args) {
        var map = new LinkedHashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("b", 4);

        System.out.println(map.get("a"));
        System.out.println(map);


        //Options
        //1. 1 {c=3, b=4, a=1}
        //2. 1 {a=1, b=4, c=3}
        //3. None of these
    }

    //Answer
    // 2
    // 5

}
