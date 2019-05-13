package com.tester.thread.producer.consumer.case2;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class MainClass {
    public static void main(String[] args) {
        BlockingQueue<Integer> listOfItems= new ArrayBlockingQueue<>(10);
        Runnable producer = new Producer(listOfItems);
        new Thread(producer).start();


        Runnable consumer = new Consumer(listOfItems);
        new Thread(consumer).start();


    }


}
