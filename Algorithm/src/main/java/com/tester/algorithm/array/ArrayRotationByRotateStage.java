package com.tester.algorithm.array;

import com.tester.algorithm.array.util.RotateStage;
import com.tester.sort.SortUtils;


public class ArrayRotationByRotateStage {
    public static void main(String[] args) {
        ArrayRotationByRotateStage thisInstance = new ArrayRotationByRotateStage();
        int[] elements = SortUtils.oneToSeven;
        int byPositions = 2;
        SortUtils.print("Input :", elements);
        thisInstance.rotate(elements, byPositions, RotateStage.LEFT);
        SortUtils.print("Output :", elements);


    }

    //1) Program for array rotation
    public void rotate(int[] elements, int byPositions, RotateStage stage) {
        int[] backup = new int[byPositions];
        int length = elements.length;
        if (RotateStage.LEFT.equals(stage)) {
            // Tacking backup of number of position element.
            for (int i = 0; i < byPositions; i++) {
                backup[i] = elements[i];
            }
            // Sifting by the position to the left
            for (int i = 0; i < length - byPositions; i++) {
                elements[i] = elements[i + byPositions];
            }
            // inserting backup element int the main array al last.
            for (int i = 0; i < byPositions; i++) {
                elements[length - byPositions + i] = backup[i];
            }
        } else {
            // Tacking backup of number of position element
            for (int j = 0, i = (length - byPositions); i < length && j < byPositions; i++, j++) {
                backup[j] = elements[i];
            }
            // sifting by the position of element to right.
            for (int i = (length - 1) - byPositions; i >= 0; i--) {
                elements[i + byPositions] = elements[i];
            }
            // inserting backup into element in right
            for (int i = 0; i < byPositions; i++) {
                elements[i] = backup[i];
            }
        }
    }


    public void rotate1(int[] elements, int byPositions, RotateStage stage) {
        int[] backup = new int[byPositions];
        int length = elements.length;
        if (RotateStage.LEFT.equals(stage)) {
            for (int i = 0; i < byPositions; i++) {
                backup[i] = elements[i];
            }
        } else {
            for (int j = 0, i = (length - byPositions); i < length && j < byPositions; i++, j++) {
                backup[j] = elements[i];
            }
        }
        if (RotateStage.LEFT.equals(stage)) {
            for (int i = 0; i < length - byPositions; i++) {
                elements[i] = elements[i + byPositions];
            }
        } else {
            for (int i = (length - 1) - byPositions; i >= 0; i--) {
                elements[i + byPositions] = elements[i];
            }
        }
        if (RotateStage.LEFT.equals(stage)) {
            for (int i = 0; i < backup.length; i++) {
                elements[length - byPositions + i] = backup[i];
            }
        } else {
            for (int i = 0; i < backup.length; i++) {
                elements[i] = backup[i];
            }
        }
    }
}


