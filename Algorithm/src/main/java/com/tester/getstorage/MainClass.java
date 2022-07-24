package com.tester.getstorage;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MainClass {
    public static void main(String[] args) {

        int[] allInput = {1, 3, 4, 5};

        Map<Integer, Integer> con = new TreeMap<>();
        con.put(1, 1);
        con.put(3, 2);
        con.put(4, 1);
        con.put(6, 1);
        con.put(7, 3);

        int sum = 0;

        for (Map.Entry<Integer, Integer> unitX : con.entrySet()) {

            Integer key = unitX.getKey();

            int next = key++;
            while (con.containsKey(next)) {
                Integer nextBulding = con.get(next);
                sum += getUnitOfWaterBetweenTwoBuilding(key, nextBulding);
            }


        }
        System.out.println(sum);


    }

    private static int getUnitOfWaterBetweenTwoBuilding(Integer key, Integer nextBulding) {

        return Math.min(key, nextBulding);

    }
}
