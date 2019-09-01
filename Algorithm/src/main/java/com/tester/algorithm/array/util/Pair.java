package com.tester.algorithm.array.util;

public class Pair {
    private String firstValue;
    private String secondValue;


    public Pair(String firstValue, String secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "firstValue='" + firstValue + '\'' +
                ", secondValue='" + secondValue + '\'' +
                '}';
    }
}