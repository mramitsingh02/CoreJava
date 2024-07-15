package org.example;


import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class ListAllMaxNumberInEachSlide {
    public static void main(String[] args) {
        int input[] = {4, 0, -1, 3, 5, 3, 6, 8};
        int k = 3;

        System.out.println(solveUsingSlidingWindows(input, k));
        int[] arr = { 2, 3, 7, 9, 5, 1, 6, 4, 3 };

        // Find the maximum element in each sliding window
        // of size k
        List<Integer> result = maxSlidingWindow(arr, k);

        // Print the results
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    private static List<Integer> maxSlidingWindow(int[] array, int k) {
        List<Integer> allPossibleSet = new ArrayList<>();
        PriorityQueue<Pair> heap = new PriorityQueue<>((a, b) -> b.value - a.value);
        for (int i = 0; i < k; i++) {
            heap.offer(Pair.of(array[i], i));
        }
        allPossibleSet.add(heap.peek().value);
        for (int i = k; i < array.length; i++) {

            heap.offer(Pair.of(array[i], i));

            while (heap.peek().index <= i - k) {
                heap.poll();
            }
            allPossibleSet.add(heap.peek().value);


        }

        return allPossibleSet;
    }

    private static List<Integer> solveUsingSlidingWindows(int[] array, int k) {

        List<Integer> allPossibleSet = new ArrayList<>();
        int i = 0, j = 0;
        while (j - i + 1 < k) {
            j++;
        }
        while (j < array.length) {

            allPossibleSet.add(findMaxInSubset(array, i, j));
            i++;
            j++;
        }
        return allPossibleSet;

    }

    private static int findMaxInSubset(int[] array, int i, int j) {
        int max = Integer.MIN_VALUE;
        for (int k = i; k <= j; k++) {
            max = Math.max(max, array[k]);
        }
        return max;
    }

    private static class Pair {
        int value;
        int index;

        public Pair(int value, int index) {

            this.value = value;
            this.index = index;
        }

        public static Pair of(int value, int index) {
            return new Pair(value, index);
        }
    }
}
