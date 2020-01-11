package com.tester.thread.parallel;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.stream.IntStream;

public class IntStreamDemo {
    public static void main(String[] args) {
        IntStreamDemo thisInstance = new IntStreamDemo();
        thisInstance.test(500);
    }

    public void test(int size) {
        List<String> lstOfString = new ArrayList<>(size);
        ConcurrentLinkedQueue<String> lstOfQueue = new ConcurrentLinkedQueue<String>();

       // CopyOnWriteArrayList<String> lstOfString1 = new CopyOnWriteArrayList<String>(lstOfString);

        IntStream.range(0, size).sequential().forEach(x -> lstOfQueue.add("Demo" + x));



        System.out.println("Size = " + (size - lstOfQueue.size()));
//        System.out.println("Size = " + (size - lstOfString1.size()));


    }

}
