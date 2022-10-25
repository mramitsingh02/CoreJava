package com.tester.collection.puzzler;

import java.util.ArrayList;
import java.util.List;

public class _2a_SubList {
    public static void main(String[] args) {

        var ints = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        var subList = ints.subList(0, 0);

        System.out.println(subList);

        subList.addAll(List.of(10, 11, 12));
        System.out.println(ints);

        //Options
        //1. []{1,2,3,4,5}
        //2. Unsupported Exception
        //3. Neither of these
    }

    //Answer
    // 3
    //[10, 11, 12, 1, 2, 3, 4, 5]

}
