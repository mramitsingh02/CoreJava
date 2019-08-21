package com.tester.algorithm.array;

import com.tester.sort.SortUtils;

import java.util.Arrays;

public class RemoveDuplicateNumber {
    public static void main(String[] args) {
        RemoveDuplicateNumber thisInstance = new RemoveDuplicateNumber();
        SortUtils.print(SortUtils.DUPLICATE_ELEMENTS);
        int[] newArrays = thisInstance.removeDuplicateElementUsingLinear(SortUtils.DUPLICATE_ELEMENTS);
        SortUtils.print(newArrays);

        int[] newArrays1 = thisInstance.removeDuplicateElementUsingCounting(SortUtils.DUPLICATE_ELEMENTS);
        SortUtils.print(newArrays1);

    }

    public int[] removeDuplicateElementUsingCounting(int[] elements) {
        int[] counting = new int[SortUtils.maxValue(elements) + 1];
        for (int i = 0; i < elements.length; i++) {
            counting[elements[i]]++;
        }
        //FIXME Need To code for this

/*        int[] result = new int[elements.length];
        for (int i = counting.length - 1; i >= 0; i--) {
            result[counting[i] - 1] = elements[i];
            counting[i]++;
        }*/
        return new int[0];
    }

    public int[] removeDuplicateElementUsingLinear(int[] elements) {
        int length = elements.length;
        int[] uniqueElement = new int[length];
        Arrays.fill(uniqueElement, -1);
        uniqueElement[0] = elements[0];
        int count = 1;
        for (int index = 0; index < length; index++) {
            boolean isDuplicate = false;
            int element = elements[index];
            for (int uinx = 0; uinx < count; uinx++) {
                if (uniqueElement[uinx] == element) {
                    isDuplicate = true;
                }
            }
            if (!isDuplicate) {
                uniqueElement[count] = element;
                count++;
            }
        }
        return Arrays.copyOf(uniqueElement, count);
    }

    public int[] removeDuplicateElement(int[] elements) {


        return new int[0];
    }

}
