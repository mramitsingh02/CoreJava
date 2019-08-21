package com.tester.algorithm.array;

import com.tester.sort.SortUtils;

public class Find3rdLargestNumber {
    public static void main(String[] args) {
        Find3rdLargestNumber thisInstance = new Find3rdLargestNumber();
        int position = 3;
        int number = thisInstance.largestNumber(SortUtils.DUPLICATE_ELEMENTS, position);
        SortUtils.print(SortUtils.DUPLICATE_ELEMENTS);
        System.out.println( position + "th Largest Number is : " + number);

    }

    public int largestNumber(int[] elements, int position) {
        int max = SortUtils.maxValue(elements);
        int[] maxArray = new int[max + 1];
        for (int i = 0; i < elements.length; i++) {
            maxArray[elements[i]]++;
        }
        for (int index = maxArray.length - 1; index >= 0 && position > 0; index--) {
            if (maxArray[index] > 0) {
                position--;
                if (position == 0) {
                    return index;
                }
            }
        }


        return -1;
    }
}
