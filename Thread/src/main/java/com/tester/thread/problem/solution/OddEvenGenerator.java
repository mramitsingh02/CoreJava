package com.tester.thread.problem.solution;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class OddEvenGenerator {
    public static void main(String[] args) throws InterruptedException {

        Lock lock = new ReentrantLock();

        Condition evenCondition = lock.newCondition();
        Condition oddCondition = lock.newCondition();


//        NumberPrint numberPrint = new NumberPrint(100);
//        new Thread(() -> numberPrint.printEvenNumber()).start();
//        new Thread(() -> numberPrint.printOddNumber()).start();

        NumberPrint2 numberPrint1 = new NumberPrint2(100, lock);
        new Thread(() -> numberPrint1.printEvenNumber()).start();
        new Thread(() -> numberPrint1.printOddNumber()).start();


    }

    private static class NumberPrint2 {
        private final Lock lock;
        private final int anInt;
        private final Condition evenCondition;
        private final Condition oddCondition;
        private int currentNumber;

        private NumberPrint2(int anInt, Lock lock) {
            this.lock = lock;
            evenCondition = lock.newCondition();
            oddCondition = lock.newCondition();
            this.anInt = anInt;
        }

        public void printEvenNumber() {
            while (currentNumber < anInt) {

                if (lock.tryLock()) {

                    while (currentNumber % 2 == 1) {
                        try {
                            oddCondition.await();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    System.out.println("T1:" + currentNumber++);
                    evenCondition.signal();
                }


            }
        }

        public void printOddNumber() {
            while (currentNumber < anInt) {

                if (lock.tryLock()) {
                    while (currentNumber % 2 == 0) {
                        try {
                            evenCondition.await();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }

                    System.out.println("T2:" + currentNumber++);
                    oddCondition.signal();
                }
            }
        }

    }


    public static class NumberPrint {

        private final int num;
        private int counter;

        public NumberPrint(int num) {
            this.num = num;
        }


        public void printOddNumber() {
            while (counter < num) {
                synchronized (this) {
                    while (counter % 2 == 0) {
                        try {
                            wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    System.out.println("T2:" + counter++);
                    notify();

                }
            }
        }


        public void printEvenNumber() {
            while (counter < num) {
                synchronized (this) {
                    while (counter % 2 == 1) {
                        try {
                            wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    System.out.println("T1:" + counter++);
                    notify();

                }
            }

        }

    }
}


