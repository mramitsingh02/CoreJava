package com.datastructure.queue;

public class QueueUsingLinkedListDemo {
    public static void main(String[] args) {
        CustomQueue thisInstance = new QueueUsingLinkedList();

        thisInstance.put(10);
        thisInstance.put(11);
        thisInstance.put(12);
        thisInstance.put(13);
        thisInstance.put(14);
        thisInstance.put(15);

        thisInstance.print();
        System.out.println("======================================");

        System.out.println("Poping");
        System.out.println(thisInstance.get());
        System.out.println(thisInstance.get());
        System.out.println(thisInstance.get());
        System.out.println(thisInstance.get());
        System.out.println(thisInstance.get());
        try {

            System.out.println(thisInstance.get());
            System.out.println(thisInstance.get());

        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        thisInstance.put(15);
        thisInstance.print();

    }
}
