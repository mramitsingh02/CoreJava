package com.tester.algorithm;

import java.util.Scanner;

public class OddEvenProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int inputNumber = scanner.nextInt();
        if(inputNumber % 2 == 0){
            System.out.println("This is even number.");
        }else {
            System.out.println("This is odd number.");
        }

    }
}
