package com.tester.case1;

import java.math.BigInteger;

public class PowerOfNumberRecursiveOptimization {
    public static void main(String[] args) {

        PowerOfNumberRecursiveOptimization thisInstance = new PowerOfNumberRecursiveOptimization();

        int number = 12;
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
        if (power % 2 == 0) {
            BigInteger y = pow(power / 2, number);
            return y.multiply(y);
        } else {
            BigInteger y = pow((power - 1) / 2, number);
            return BigInteger.valueOf(number).multiply(y).multiply(y);
        }


    }
}
