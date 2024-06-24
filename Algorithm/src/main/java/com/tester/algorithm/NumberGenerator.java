package com.tester.algorithm;

import java.util.Scanner;

public class NumberGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Arpit Please, Enter the number:");
        int inputNumber = scanner.nextInt();
        System.out.println("Table");
        for (int j = 1; j <= inputNumber; j++) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(j + " x " + i + " =" + (j * i));
            }
            System.out.println();
        }
    }

}
