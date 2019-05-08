package com.tester.ex1;

public class MyClass {

    public static void main(String[] args) throws InterruptedException {
        Displya d = new Displya();
        Thread thread = new Thread(new MyRunner(d, "Vinod"));
        thread.start();

        Thread thread2 = new Thread(new MyRunner(d, "Jitu"));
        thread2.start();
        thread2.join();

        Thread thread1 = new Thread(new MyRunner(d, "Amit"));
        thread1.start();




    }

}
