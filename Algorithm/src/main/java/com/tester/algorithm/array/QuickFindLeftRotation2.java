package com.tester.algorithm.array;

public class QuickFindLeftRotation2 {
    public static void main(String[] args) {
        QuickFindLeftRotation2 thisInstance = new QuickFindLeftRotation2();
        int[] elements = {1, 3, 5, 7, 9};
        int n = elements.length;

        int k = 2;
        thisInstance.leftRotate(elements, n, k);
        k = 3;
        thisInstance.leftRotate(elements, n, k);
        k = 4;
        thisInstance.leftRotate(elements, n, k);
        k = 5;
        thisInstance.leftRotate(elements, n, k);

    }

    public void leftRotate(int[] elements, int n, int k) {
        int start = k ;
        for (int i = start; i < start + n; i++)
            System.out.print(elements[i % n] + " ");

        System.out.print("\n");


    }
}
