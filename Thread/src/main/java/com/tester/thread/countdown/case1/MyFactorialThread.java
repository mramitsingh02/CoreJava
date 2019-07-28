package com.tester.thread.countdown.case1;

import java.math.BigInteger;
import java.util.concurrent.CountDownLatch;

public class MyFactorialThread  implements Runnable{
    private final Integer inputValue;
    private  final CountDownLatch countDownLatch;

    public MyFactorialThread(Integer inputValue, CountDownLatch countDownLatch) {
        this.inputValue = inputValue;
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {





    }

private  static class Factorial{
        public BigInteger factorial(int inputValue){


            if(inputValue == 0){
                return BigInteger.ONE;
            }
            BigInteger bigInteger= BigInteger.ONE;
            for (BigInteger i = BigInteger.ONE ; i.compareTo(BigInteger.valueOf(inputValue)) != 0; i = i.add(BigInteger.ONE)){
                bigInteger= bigInteger.multiply(i);

            }




        }

}
}
