package com.tester.getstorage;

import com.tester.sort.SortUtils;

import java.util.Arrays;

public class ArrayRotationBy {

    public static void main(String[] args) {
        int[] elements = SortUtils.elements.clone();
        SortUtils.print(elements);

        int byIndex = 3;
        rotateBy(elements, byIndex);
        System.out.println("After Rotation : \n" + Arrays.toString(elements));

    }

    private static void rotateBy(int[] elements, int byIndex) {
        if (byIndex < 0 || elements.length < byIndex) {
            throw new IllegalArgumentException("Wrong Input " + byIndex);
        }

        int length = elements.length;
        int backup[] = new int[byIndex];

        for (int i = (length) - byIndex, j =0; j < backup.length; i++, j++) {
            backup[j] = elements[i];
        }
        System.out.println("backup Rotation : \n" + Arrays.toString(backup));

    }


}
