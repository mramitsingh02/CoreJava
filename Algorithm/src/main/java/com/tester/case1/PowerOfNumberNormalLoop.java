package com.tester.case1;

import java.math.BigInteger;

public class PowerOfNumberNormalLoop {
    public static void main(String[] args) {
        PowerOfNumberNormalLoop thisInstance = new PowerOfNumberNormalLoop();

        int number = 12;
        int power = 31;
        long startTime = System.currentTimeMillis();
        BigInteger powerOf = thisInstance.pow(power, number);
        System.out.println(powerOf);
        long endTime = System.currentTimeMillis();
        System.out.println("Time Diff : " + (endTime - startTime) + "ms.");


    }

    public BigInteger pow(int power, int number) {
        BigInteger powerValue = BigInteger.ONE;
        for (int i = power; i > 0; i--) {
            powerValue = powerValue.multiply(BigInteger.valueOf(number));
        }
        return powerValue;
    }
}
