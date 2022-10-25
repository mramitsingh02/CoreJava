package com.tester.collection.puzzler;

import java.util.IdentityHashMap;

public class _6a_IdentityHashMap {
    public static void main(String[] args) {
        var map = new IdentityHashMap<Integer, String>();

        map.put(1, "one");
        map.put(10, "ten");
        map.put(100, "hundred");
        map.put(1000, "thousand");

        map.put(1, "one other");
        map.put(10, "ten other");
        map.put(100, "hundred other");
        map.put(1000, "thousand other");
        System.out.println(map.size());


        //Options
        //1. 4
        //2. 5
        //3. 8
        //4. None of these
    }

    //Answer
    // 2
    // 5

}
