package com.tester.common.error;

import java.util.ArrayList;
import java.util.List;

public class CollectionError {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Vinod");
        doSomeOperation(list);
        System.out.println(list);
    }

    private static void doSomeOperation(List<String> list) {
        list.add("Kumar");
        list = new ArrayList<>();
        list.add("Amit");
        System.out.println(list);
    }
}
