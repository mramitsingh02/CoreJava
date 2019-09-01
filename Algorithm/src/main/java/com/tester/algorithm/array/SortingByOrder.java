package com.tester.algorithm.array;

import com.tester.algorithm.array.util.Order;
import com.tester.sort.SortUtils;


public class SortingByOrder {

    public static void main(String[] args) {
        SortingByOrder thisInstance = new SortingByOrder();
        thisInstance.sort(SortUtils.elements, Order.ASC);
        SortUtils.print(SortUtils.elements);
    }

    public void sort(int[] elements, Order order) {
        int max = SortUtils.maxValue(elements);
        int min = SortUtils.minValue(elements);
        int[] result = new int[elements.length];
        int range = (max);
        int[] count = new int[range + 1];

        for (int i = 0; i < elements.length; i++) {
            count[elements[i]]++;
        }

        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        for (int i = result.length - 1; i >= 0; i--) {
            result[count[elements[i] - 1]] = elements[i];
            --count[elements[i] - 1];
        }

        for (int i = 0; i < result.length; i++) {
            int index = i;
            if (Order.DESC.equals(order)) {
                index = (result.length - 1) - i;
            }
            elements[i] = result[index];
        }
    }
}
