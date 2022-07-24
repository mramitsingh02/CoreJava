package com.tester.case2;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random randI = new Random();
        int myRandInt = randI.ints(1, 101).findAny().getAsInt();
        System.out.println("Random number between 1 and 100: "+myRandInt);
        int i = 0;
        System.out.println(i);

    }
}
