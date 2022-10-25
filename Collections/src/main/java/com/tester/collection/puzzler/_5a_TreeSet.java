package com.tester.collection.puzzler;

import java.util.*;

public class _5a_TreeSet {
    public static void main(String[] args) {

        Set<String> hashSet = new HashSet<>(List.of("a", "b", "c"));
        Set<String> treeSet = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        treeSet.addAll(List.of("A", "B", "C"));

        System.out.print(treeSet.equals(hashSet) + " " + hashSet.equals(treeSet) );


        //Options
        //1. true true
        //2. false true
        //3. true false
        //4. None of these
    }

    //Answer
    // 3
    // true false

}
