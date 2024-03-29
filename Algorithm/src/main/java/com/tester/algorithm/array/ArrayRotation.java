package com.tester.algorithm.array;

import com.tester.sort.SortUtils;

import javax.xml.stream.events.Comment;


public class ArrayRotation {
    public static void main(String[] args) {
        ArrayRotation thisInstance = new ArrayRotation();
        int[] elements = SortUtils.elements;
        int byPositions = 3;
        SortUtils.print("Input :", elements);
        thisInstance.rotate(elements, byPositions);
        SortUtils.print("Output :", elements);

        SortUtils.print("Input :", elements);
        thisInstance.rotate(elements);
        SortUtils.print("Output :", elements);


    }

    //1) Program for array rotation
    public void rotate(int[] elements, int byPositions) {
        int[] backup = new int[byPositions];
        int length = elements.length;
        if(byPositions < 0 || byPositions > length || (length - byPositions) < 0)
            throw new  IllegalArgumentException("Given input is no correct.");



        for (int j = 0, i = (length - byPositions); i < length && j < byPositions; i++, j++) {
            backup[j] = elements[i];
        }
        int actualIndex = elements.length - 1;
        for (int i = (actualIndex - byPositions); i >= 0; i--) {
            elements[i + byPositions] = elements[i];
        }
        for (int i = 0; i < backup.length; i++) {
            elements[i] = backup[i];
        }
    }

    //1) Program for array rotation
    public void rotate(int[] elements) {
        int lastValue = elements[elements.length - 1];
        int i = 0;

        int length = elements.length;
        for (i = length - 1; i > 0; i--) {
            elements[i] = elements[i - 1];
        }
        elements[0] = lastValue;
    }

}


