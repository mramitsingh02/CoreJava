package com.singletone.case1;

public class SingleTone {
    private static SingleTone ourInstance = new SingleTone();

    public static SingleTone getInstance() {
        return ourInstance;
    }

    private SingleTone() {
    }
}
