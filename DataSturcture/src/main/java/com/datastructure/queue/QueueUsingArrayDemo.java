package com.datastructure.queue;

public class QueueUsingArrayDemo {
    public static void main(String[] args) {
        CustomQueue thisInstance = new QueueUsingArray(5);

        thisInstance.put(10);
        thisInstance.put(11);
        thisInstance.put(12);
        thisInstance.put(13);
        thisInstance.put(14);
        thisInstance.put(15);

        thisInstance.print();
        System.out.println("======================================");

        thisInstance.get();
        thisInstance.get();
        thisInstance.get();
        thisInstance.get();
        thisInstance.get();

        thisInstance.get();
        thisInstance.get();
        thisInstance.put(15);
        thisInstance.print();

    }
}
