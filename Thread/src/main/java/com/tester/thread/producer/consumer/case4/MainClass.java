package com.tester.thread.producer.consumer.case4;


public class MainClass {
    public static void main(String[] args) {


        MyCustomeQueue<Integer> listOfItems = new MyCustomeQueue<>();
        new Thread(new Producer(listOfItems)).start();
        new Thread(new Consumer(listOfItems)).start();
    }
}
