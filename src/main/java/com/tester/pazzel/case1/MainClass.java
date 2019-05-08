package com.tester.pazzel.case1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MainClass {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input params:   " + Arrays.toString(Fruits.values()));
        System.out.println("Enter Input: ");
        String inputString = scanner.nextLine();
        Set<String> list = new HashSet<>();
        char[] chars = inputString.toCharArray();

        int totalGroup = 0;

        for (char c : chars) {
            if (Fruits.hasFruit(Character.toString(c))) {
                System.out.println("☻•◘○♦♣♠☺☻♥");
                list.add(Character.toString(c));
            }

            if (list.size() == Fruits.values().length) {
                list.clear();
                totalGroup += 1;
            }
        }
        System.out.println("Teams :" + totalGroup);
    }

/*    public static boolean hasFruit(String fruitName) {

        boolean temp = false;
        for (Fruits f : Fruits.values()) {
            temp = f.toString().equals(fruitName);
            if (temp)
                return true;
        }


        return false;
    }*/
}
