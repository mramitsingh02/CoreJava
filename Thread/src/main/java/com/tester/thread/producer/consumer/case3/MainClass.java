package com.tester.thread.producer.consumer.case3;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {

        String lockObject = new String("Lock");
        List<Integer> listOfItems = new ArrayList<>();
        int maxSize = 10;
        new Thread(new Producer(listOfItems, lockObject, maxSize)).start();

        new Thread(new Consumer(listOfItems, lockObject)).start();
    }
}
