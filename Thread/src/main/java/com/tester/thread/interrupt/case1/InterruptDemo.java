package com.tester.thread.interrupt.case1;

public class InterruptDemo {


    public static void main(String[] args) {

        Thread thread = new Thread(new InterruptRunner());

        thread.start();

        thread.interrupt();

    }


}
