package com.tester.problem.solution;

public class KthSmallestElement {
    /**
     * Given an array arr[] and an integer K where K is smaller than size of array, the task is to find the Kth smallest element in the given array. It is given that all array elements are distinct.
     * <p>
     * Note :-  l and r denotes the starting and ending index of the array.
     * <p>
     * Example 1:
     * <p>
     * Input:
     * N = 6
     * arr[] = 7 10 4 3 20 15
     * K = 3
     * Output : 7
     * Explanation :
     * 3rd smallest element in the given
     * array is 7.
     */
    public static void main(String[] args) {
        int N = 6;
        int[] arr = {7, 10, 4, 3, 20, 15};
        int K = 3;


        int kthSmallestElement = kthSmallestElement(arr, N, K);

        System.out.println(kthSmallestElement);

    }


    static int kthSmallestElement(int[] arrays, int size, int smallest) {
        int[] smallArr = new int[smallest];
        int sIndex = smallest;
        smallArr[--sIndex] = smallest;

        for (int i = 0; i < arrays.length; i++) {
            if (smallArr[sIndex] < arrays[i]) {
                smallArr[--sIndex] = arrays[i];
            }

        }


        return smallest;
    }

}
