package com.datastructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CallByRefernce {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("abc");
        System.out.println(list);
        list.addAll(getAnamikaFamilyNames());
        System.out.println(list);

    }

    private static List<String> getAnamikaFamilyNames() {
        final List<String> list = new ArrayList<>();
        list.add("Anamika");
        System.out.println(list);
        return Collections.unmodifiableList(list);
    }
}
