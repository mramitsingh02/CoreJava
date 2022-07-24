package com.tester.algorithm.array;

public class ArraryDemo {
    public static void main(String[] args) {

        // aaabbaab
        // a3b2a2b1
        int[] intArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] array = {1, 2, 3, 1, 5, 2};

        int[] newArray = new int[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
        int max = array[0];
        int secondMax = array[0];

        for (int i = 0; i < array.length; i++) {


            if (array[i] > max) {
                secondMax = max;
                max = array[i];
            }


        }

        System.out.println(secondMax);


    }

    private static void print(int[] array) {

        for (int i : array) {
            System.out.print(i + ",");
        }
    }


}
