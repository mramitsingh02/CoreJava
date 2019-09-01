package com.tester.algorithm.array;

public class QuickFindLeftRotation {
    public static void main(String[] args) {
        QuickFindLeftRotation thisInstance = new QuickFindLeftRotation();
        int[] elements = {1, 3, 5, 7, 9};
        int n = elements.length;

        int[] temp = new int[n * 2];
        thisInstance.preProcess(elements, n, temp);
        int k = 2;
        thisInstance.leftRotate(elements, n, k, temp);
        k = 3;
        thisInstance.leftRotate(elements, n, k, temp);
        k = 4;
        thisInstance.leftRotate(elements, n, k, temp);
        k = 5;
        thisInstance.leftRotate(elements, n, k, temp);

    }

    public void preProcess(int[] elements, int n, int[] temp) {
        for (int i = 0; i < n; i++) {
            temp[i] = temp[i + n] = elements[i];
        }
    }

    public void leftRotate(int[] elements, int n, int k, int[] temp) {
        int start = k % n;
        for (int i = start; i < start + n; i++)
            System.out.print(temp[i] + " ");

        System.out.print("\n");


    }
}
