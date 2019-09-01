package com.tester.algorithm.array;

import com.tester.algorithm.array.util.Order;
import com.tester.sort.SortUtils;

import java.util.Arrays;

import static com.tester.sort.SortUtils.swap;

public class FindNthNumber {
    public static void main(String[] args) {
        FindNthNumber thisInstance = new FindNthNumber();
        int position = 3;
        int number = thisInstance.largestNumber(SortUtils.DUPLICATE_ELEMENTS, position);
        int smallestNumber = thisInstance.smallestNumber(SortUtils.DUPLICATE_ELEMENTS, position);
        SortUtils.print(SortUtils.DUPLICATE_ELEMENTS);
        System.out.println(position + "th Largest Number is : " + number);
        System.out.println(position + "th Smallest Number is : " + smallestNumber);

    }

    private int smallestNumber(int[] elements, int position) {
        int[] ints = new int[position + 1];
        Arrays.fill(ints, SortUtils.maxValue(elements));
        for (int i = 0; i < elements.length; i++) {
            fillAndSortForSmallest(ints, elements[i]);
        }
        return ints[ints.length - position];
    }

    private void fillAndSortForSmallest(int[] max, int item) {
        max[0] = item;
        if (!isDuplicateEntry(max, item)) {
            this.sort(max);
        }
    }

    public int largestNumber(int[] elements, int position) {
        int[] ints = new int[position + 1];
        for (int i = 0; i < elements.length; i++) {
            fillAndSort(ints, elements[i]);
        }

        return ints[position - 1];
    }

    private void fillAndSort(int[] max, int item) {
        max[max.length - 1] = item;
        if (!isDuplicateEntry(max, item)) {
            this.sort(max);
        }
        resetLastPosition(max);

    }

    private void fillAndSort(int[] max, int i, Order order) {
        max[max.length - 1] = i;
        if (!isDuplicateEntry(max, i)) {
            this.sort(max, order);
        }
        resetLastPosition(max, order);
    }

    public void sort(int[] elements, Order order) {
        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements.length - 1; j++) {
                if (Order.DESC.equals(order)) {
                    if (elements[i] > elements[j]) {
                        swap(elements, i, j);
                    }
                } else if (Order.ASC.equals(order)) {
                    if (elements[j] > elements[i]) {
                        swap(elements, i, j);
                    }
                }

            }
        }
    }

    public void sortForSmallest(int[] elements) {
        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements.length - 1; j++) {
                if (elements[i] < elements[j]) {
                    swap(elements, i, j);
                }
            }
        }
    }

    public void sort(int[] elements) {
        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements.length - 1; j++) {
                if (elements[i] > elements[j]) {
                    swap(elements, i, j);
                }
            }
        }
    }

    private void resetLastPosition(int[] max, Order order) {
        max[max.length - 1] = 0;
    }

    private void resetLastPosition(int[] max) {
        max[max.length - 1] = 0;
    }

    private boolean isDuplicateEntry(int[] max, int i) {
        int c = 0;
        for (int j = 0; j < max.length; j++) {
            if (i == max[j]) {
                c++;
            }
        }
        if (c > 1) {
            return true;
        }
        return false;
    }
}
