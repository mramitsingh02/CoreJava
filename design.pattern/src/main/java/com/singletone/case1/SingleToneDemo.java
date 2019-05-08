package com.singletone.case1;

public class SingleToneDemo {
    public static void main(String[] args) {



        SingleTone singleTone = SingleTone.getInstance();

        System.out.println(singleTone.hashCode());




    }

}
