package com.tester.algorithm.array;

import com.tester.sort.SortUtils;


public class AscendingOrderSorting {

    public static void main(String[] args) {
        AscendingOrderSorting thisInstance = new AscendingOrderSorting();
        thisInstance.sort(SortUtils.elements, Order.ASC);
    }

    public void sort(int[] elements, Order order) {

        int max = SortUtils.maxValue(elements);
        int min = SortUtils.minValue(elements);
        int range = (max);
        int[] count = new int[range + 1];

        for (int i = 0; i < elements.length; i++) {
            count[elements[i]]++;
        }

        for (int i = 1; i < count.length; i++) {
            count[i] += count[i-1];
        }






    }
}
