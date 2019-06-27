package com.tester.thread.creation.case2;

public class MainClass {

    public static void main(String[] args) {
        Thread thread = new MyThread();
        thread.start();

        thread.interrupt();
        System.out.println("Current Thread is running : "+ Thread.currentThread().getName()+ " ......");

    }
    private static  class MyThread extends Thread{

        @Override
        public void run() {
            System.out.println("Current Thread is running : "+ this.getName());
        }
    }

}
