package com.tester.solution;

public class NumberFunction {
    //generate two method one return odd number and second even number
    private static int number = 1;

    //synchronized method to get odd number
    public static synchronized int getOddNumber() {
        while (isEven(number)) {
            try {
                NumberFunction.class.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        NumberFunction.class.notify();
        return number++;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    //synchronized method to get even number
    public static synchronized int getEvenNumber() {
        while (isOdd(number)) {
            try {
                NumberFunction.class.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        NumberFunction.class.notify();
        return number++;
    }

    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }


}
