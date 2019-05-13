package com.singletone.case2;

public class SingleTone {
    private static SingleTone ourInstance = null;

    /**
     * SingleTone instance create by lazy initialization.
     * When getInstance method call then object will created
     *
     * @return
     * SingleTone object instance.
     */
    public static SingleTone getInstance() {
        if(ourInstance == null){
            ourInstance = new SingleTone();
        }

        return ourInstance;
    }

    private SingleTone() {
    }
}
