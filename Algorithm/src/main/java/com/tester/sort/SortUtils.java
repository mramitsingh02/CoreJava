package com.tester.sort;

import java.util.Arrays;

public class SortUtils {

    public static final int[] oneToSeven = {1, 2, 3, 4, 5, 6, 7};
    public static final int[] elements = {18, 9, 33, 4, 84, 32, 96, 12, 11, 5, 122, 100};
    public static final int[] duplicateElements = {18, 9, 33, 4, 84, 32, 96, 12, 11, 5, 122, 100, 84, 4, 6, 11};
    public static final int[] expected = {4, 5, 9, 11, 12, 18, 32, 33, 84, 96, 100, 122};
    public static final int[] DUPLICATE_ELEMENTS = {9, 13, 3, 2, 7, 5, 11, 3, 5, 9};


    public static void swap(int[] elements, int fromIdx, int toIdx) {
        int temp = elements[fromIdx];
        elements[fromIdx] = elements[toIdx];
        elements[toIdx] = temp;
    }

    public static void print(int[] elements) {
        System.out.println(Arrays.toString(elements));
    }

    public static void print(String preMessage, int[] elements) {
        System.out.println(preMessage + " " + Arrays.toString(elements));
    }

    public static int maxValue(int[] elements) {
        int maxNumber = Arrays.stream(elements).max().getAsInt();
        return maxNumber;
    }

    public static int minValue(int[] elements) {
        int minNumber = Arrays.stream(elements).min().getAsInt();
        return minNumber;
    }

    public static int[][] matrix(int xSize, int ySize) {
        int[][] matrix = new int[xSize][ySize];
        for (int i = 0; i < xSize; i++) {
            for (int j = 0; j < ySize; j++) {
                matrix[i][j] = i + 1;
            }
        }
        return matrix;
    }

    public static void print(int[][] matrix, int xSize, int ySize) {
        for (int i = 0; i < xSize; i++) {
            for (int j = 0; j < ySize; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int numberOfDigit(int value) {
        return ((int) Math.log10(value) + 1);
    }

    public static void print(String[] elements) {
        System.out.println(Arrays.toString(elements));
    }

}
