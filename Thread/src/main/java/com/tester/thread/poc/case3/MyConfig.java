package com.tester.thread.poc.case3;

public class MyConfig {

    private final String alphabateRange;

    private final String numberRange;

    private final int delayTimeInMinute;

    public MyConfig(String alphabateRange, String numberRange, int delayTimeInMinute) {
        this.alphabateRange = alphabateRange;
        this.numberRange = numberRange;
        this.delayTimeInMinute = delayTimeInMinute;
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

    public int getDelayTimeInMinute() {
        return delayTimeInMinute;
    }
}
