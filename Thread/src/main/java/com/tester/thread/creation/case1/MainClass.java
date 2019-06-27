package com.tester.thread.creation.case1;

public class MainClass {

    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Current Thread is running : "+ Thread.currentThread().getName());

            }

        });

        thread.start();


        System.out.println("Current Thread is running : "+ Thread.currentThread().getName()+ " ......");

    }

}
