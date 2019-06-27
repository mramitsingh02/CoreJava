package com.tester.thread.poc.case1;

public class MyConfig {

    private final String alphabateRange;

    private final String numberRange;

    public MyConfig(String alphabateRange, String numberRange) {
        this.alphabateRange = alphabateRange;
        this.numberRange = numberRange;
    }

    @Override
    public String toString() {
        return "MyConfig{" +
                "alphabateRange='" + alphabateRange + '\'' +
                ", numberRange='" + numberRange + '\'' +
                '}';
    }


    public String getAlphabateRange() {
        return alphabateRange;
    }

    public String getNumberRange() {
        return numberRange;
    }
}
