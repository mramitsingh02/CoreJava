package com.tester.case1;

import java.math.BigInteger;

public class PowerOfNumberRecursive {
    public static void main(String[] args) {
        PowerOfNumberRecursive thisInstance = new PowerOfNumberRecursive();
        int number = 2;
        int power = 31;
        long startTime = System.currentTimeMillis();
        BigInteger powerOf = thisInstance.pow(power, number);
        System.out.println(powerOf);
        long endTime = System.currentTimeMillis();
        System.out.println("Time Diff : " + (endTime - startTime) + "ms.");


    }

    public BigInteger pow(int power, int number) {

        if (power == 0) {
            return BigInteger.ONE;
        }
        return BigInteger.valueOf(number).multiply(pow(power - 1, number));
    }
}
