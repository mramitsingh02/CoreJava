package com.tester.case1;

import java.util.Scanner;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the Number : ");

        int numberOfPrimeNumber = scanner.nextInt();
        int primeNumber = primeNumber(numberOfPrimeNumber);
        if(primeNumber == 0){
            System.out.format("%d Not Prime Number.", numberOfPrimeNumber);
        }else {
            System.out.format("%d Prime Number.", numberOfPrimeNumber);
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
