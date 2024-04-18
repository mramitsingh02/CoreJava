package com.tester.thread.problem.solution;

import com.tester.thread.utils.Pools;

import java.util.concurrent.ExecutorService;

public class OddEvenPrinter {

    private final int maxNumber;
    private int number;

    public OddEvenPrinter(final int maxNumber) {this.maxNumber = maxNumber;}


    public static void main(String[] args) {
        final ExecutorService service = Pools.of(2);
        OddEvenPrinter oddEvenPrinter = new OddEvenPrinter(50);
        final OddPrinter oddPrinter = new OddPrinter(oddEvenPrinter);
        System.out.println();
        final EvenPrinter evenPrinter = new EvenPrinter(oddEvenPrinter);
        service.submit(oddPrinter);
        service.submit(evenPrinter);
    }

    public int evenNumber() {

        synchronized (this) {
            if (number < maxNumber) {
                while (number % 2 != 0) {
                    try {
                        this.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                number++;
                this.notifyAll();
                return number;
            }
        }
        return -1;
    }

    public int oddNumber() {
        synchronized (this) {
            if (number < maxNumber) {
                while (number % 2 == 0) {
                    try {
                        this.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            number++;
            this.notifyAll();
            return number;

        }

    }

        private static class OddPrinter implements Runnable {
            private final OddEvenPrinter oddEvenPrinter;

            public OddPrinter(final OddEvenPrinter oddEvenPrinter) {
                Thread.currentThread().setName("Odd-Printer");
                this.oddEvenPrinter = oddEvenPrinter;
            }

            @Override
            public void run() {
                while (true) {
                    System.out.println(Thread.currentThread().getName() + " " + oddEvenPrinter.oddNumber());
                }
            }
        }

        private static class EvenPrinter implements Runnable {
            private final OddEvenPrinter oddEvenPrinter;

            public EvenPrinter(final OddEvenPrinter oddEvenPrinter) {
                Thread.currentThread().setName("Even-Printer");
                this.oddEvenPrinter = oddEvenPrinter;
            }

            @Override
            public void run() {
                while (true) {
                    System.out.println(Thread.currentThread().getName() + " " + oddEvenPrinter.evenNumber());
                }
            }
        }
    }
