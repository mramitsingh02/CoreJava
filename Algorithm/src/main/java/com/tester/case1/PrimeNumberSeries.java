package com.tester.case1;

public class PrimeNumberSeries {
    public static void main(String[] args) {
        int numberOfPrimeNumber = 10000;
        for (int i = 0; i < numberOfPrimeNumber; i++) {
            int primeNumber = primeNumber(i);
            if (primeNumber != 0)
                System.out.print(primeNumber + " ");
        }


    }

    private static int primeNumber(int primeNumber) {
        int count = 0;
        if (primeNumber == 1)
            return 1;
        for (int j = 1; j <= primeNumber; j++) {
            if (primeNumber % j == 0) {
                count++;
            }
        }
        if (count == 2) {
            return primeNumber;
        }
        return 0;
    }
}
