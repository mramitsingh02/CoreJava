package com.tester.collection.puzzler;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _8a_Collections {
    public static void main(String[] args) {

        var ints = List.of(1, 2, 3);
        var a = Arrays.asList(1, 2, 3);
        var c = Collections.unmodifiableCollection(ints);
        var l = Collections.unmodifiableList(ints);

        System.out.print(a.equals(c) + " ");
        System.out.print(a.equals(l) + " ");
        System.out.print(c.equals(l));


        //Options
        //1. true ture true
        //2. false true false
        //3. true false false
        //4. None of these
    }

    //Answer
    // 2
    // false true false

}
