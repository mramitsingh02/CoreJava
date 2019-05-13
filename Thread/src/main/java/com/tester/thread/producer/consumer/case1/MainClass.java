package com.tester.thread.producer.consumer.case1;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        final int maxSize = 10;
        Runnable producer = new Producer(list, maxSize);
        Thread t1 = new Thread(producer);
        t1.start();


        Runnable consumer = new Consumer(list);
        Thread t2 = new Thread(consumer);
        t2.start();

        System.out.println("Done");
    }
}
