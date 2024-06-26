package com.tester.case1;


public class CheckArmstrongNumber {
    public static void main(String[] args) {
        CheckArmstrongNumber thisInstance = new CheckArmstrongNumber();
        int[] numbers = new int[]{1634, 125, 512, 23422};
        for (int number : numbers) {
            if (thisInstance.check(number)) {
                System.out.println("Armstrong Number");
            } else {
                System.out.println("Not Armstrong Number");
            }
        }
    }

    public boolean check(int number) {
        if (number > 0) {
            int numberOfDigit = getNumberOfDigit(number);
            int sum = process(number, numberOfDigit);
            if (sum == number) {
                return true;
            }
        }
        return false;
    }

    private int process(int number, int numberOfDigit) {
        int sum = 0;
        for (int i = number; i > 0; i = i / 10) {
            int i1 = i % 10;
            sum += this.power(i1, numberOfDigit);
        }
        return sum;
    }

    private int getNumberOfDigit(int number) {
        return (int) Math.ceil(Math.log10(number));

    }

    private int getNumberOfDigitOld(int number) {
        double log = Math.ceil(Math.log10(number));
        System.out.println(log);
        int numberOfDigit = 0;
        for (int i = number; i > 0; i = i / 10) {
            numberOfDigit++;
        }
        return numberOfDigit;
    }

    private int power(int i1, int numberOfDigit) {
        PowerOfNumberRecursiveOptimization recursiveOptimization = new PowerOfNumberRecursiveOptimization();
        return recursiveOptimization.pow(numberOfDigit, i1).intValue();
    }
}
