package org.example;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

import static org.example.util.Utils.printHeader;

public class Main {
    public static void main(String[] args) {
        printHeader("Sum of minimum and maximum elements of all subarrays of size k.");
        int arr[] = {2, 5, -1, 7, -3, -1, -2};
        int k = 4;
        que01(arr, k);
    }

    private static void que01(int[] arr, int k) {
//        System.out.println(sumOfMinAndMaxElement(arr, k));
        System.out.println(sumOfMinAndMaxElementSlidingWindow(arr, k));
    }

    private static int sumOfMinAndMaxElementSlidingWindow(int[] arr, int k) {
        int sum = 0;  // Initialize result

        // The queue will store indexes of useful elements
        // in every window
        // In deque 'greatestList' we maintain decreasing order of
        // values from front to rear
        // In deque 'smallestList' we  maintain increasing order of
        // values from front to rear
        Deque<Integer> smallestList = new LinkedList<>();
        Deque<Integer> greatestList = new LinkedList<>();

        // Process first window of size K
        int i = 0;
        for (i = 0; i < k; i++) {
            // Remove all previous greater elements
            // that are useless.
            while (!smallestList.isEmpty() && arr[smallestList.peekLast()] >= arr[i])
                smallestList.removeLast(); // Remove from rear

            // Remove all previous smaller that are elements
            // are useless.
            while (!greatestList.isEmpty() && arr[greatestList.peekLast()] <= arr[i])
                greatestList.removeLast(); // Remove from rear

            // Add current element at rear of both deque
            greatestList.addLast(i);
            smallestList.addLast(i);
        }

        // Process rest of the Array elements
        for (; i < arr.length; i++) {
            // Element at the front of the deque 'greatestList' & 'smallestList'
            // is the largest and smallest
            // element of previous window respectively
            sum += arr[smallestList.peekFirst()] + arr[greatestList.peekFirst()];

            // Remove all elements which are out of this
            // window
            while (!smallestList.isEmpty() && smallestList.peekFirst() <= i - k)
                smallestList.removeFirst();
            while (!greatestList.isEmpty() && greatestList.peekFirst() <= i - k)
                greatestList.removeFirst();

            // remove all previous greater element that are
            // useless
            while (!smallestList.isEmpty() && arr[smallestList.peekLast()] >= arr[i])
                smallestList.removeLast(); // Remove from rear

            // remove all previous smaller that are elements
            // are useless
            while (!greatestList.isEmpty() && arr[greatestList.peekLast()] <= arr[i])
                greatestList.removeLast(); // Remove from rear

            // Add current element at rear of both deque
            greatestList.addLast(i);
            smallestList.addLast(i);
        }

        // Sum of minimum and maximum element of last window
        sum += arr[smallestList.peekFirst()] + arr[greatestList.peekFirst()];
        return sum;
    }

    private static int sumOfMinAndMaxElement(int[] arr, int k) {
        List<Integer> values = new ArrayList<>();
        int i = 0, j = 0;
        while ((j - i + 1) < k) {
            j++;
        }
        while (j < arr.length) {
            values.add(sumOfMinAndMax(arr, i, j));
            i++;
            j++;
        }

        return values.stream().reduce(Integer::sum).orElse(0);
    }

    private static Integer sumOfMinAndMax(int[] arr, int i, int j) {
        Integer min = Integer.MAX_VALUE;
        Integer max = Integer.MIN_VALUE;
        for (int k = i; k <= j; k++) {
            min = Math.min(min, arr[k]);
            max = Math.max(max, arr[k]);
        }

        return (min + max);
    }


}