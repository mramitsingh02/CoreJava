package com.tester.case1;

public class PrimeNumberSeriesOptimization {
    public static void main(String[] args) {
        int numberOfPrimeNumber = 100;
        for (int i = 1; i < numberOfPrimeNumber; i++) {
            if ( primeNumber(i))
                System.out.print(i  + " ");
        }
    }

    private static boolean primeNumber(int primeNumber) {
     int sqre = (int) Math.sqrt(primeNumber) + 1;
        for (int j = 2; j <= sqre; j++) {
            if (primeNumber % j == 0) {
                return false;
            }
        }
        return true;
    }


}
