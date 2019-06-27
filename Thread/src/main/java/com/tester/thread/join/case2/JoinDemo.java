package com.tester.thread.join.case2;

import org.jooq.lambda.Unchecked;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinDemo {

    public static void main(String[] args) {
        List<Thread> threads = new ArrayList<>();
        List<Integer> integerList = Arrays.asList(new Integer[]{0, 12, 144, 12999, 22222, 25, 333333});
        List<FactorialThread> modifiedThread = integerList.stream().map(integer ->new FactorialThread(integer)).collect(Collectors.toList());
        modifiedThread.forEach(s -> s.start());
        modifiedThread.forEach(Unchecked.consumer(t -> t.join(2000)));
        modifiedThread.stream().filter(x -> x.isFinished).forEach(System.out::println);
      System.out.println("Done");
    }


    private static class FactorialThread extends Thread {

        private final int number;
        private boolean isFinished = false;

        private Factorial factorial = null;

        FactorialThread(int number) {
            this.number = number;
        }

        @Override
        public void run() {
            factorial = new Factorial(this.number);
            System.out.println(String.format("Factorial of %d is %d", this.number, factorial.factorial()));
            isFinished = true;
        }

        public boolean isFinished() {
            return isFinished;
        }
    }


    private static class Factorial {
        final int number;

        Factorial(int number) {
            this.number = number;
        }

        public BigInteger factorial() {
            if (number == 0) {
                return BigInteger.ZERO;
            }
            BigInteger result = BigInteger.ONE;
            for (BigInteger i = BigInteger.ONE; i.compareTo(BigInteger.valueOf(number)) != 0; i = i.add(BigInteger.ONE)) {
                result = result.multiply(i);
            }
            return result;
        }
    }

}
