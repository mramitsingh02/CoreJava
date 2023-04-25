package com.tester.common.error;

public class SumOfNumbers {

    public static void main(String[] args) {
        System.out.println(sumNumber(20000));
    }

    private static long sumNumber(final int number) {

        //here the long primitive type will be use instead of in Warraper.
        Long sum = 0l;
        for (int i = 0; i < number; i++) {
            sum += i; // Everytime it will create memory in heap space. while long will create in stack memory.
        }
        return sum;
    }

}
