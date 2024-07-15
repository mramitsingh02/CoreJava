package org.example;

public class FindMaxConsecutiveOnes {
    public static void main(String[] args) {
        int input[] = {1, 1, 1, 1, 0, 0, 0, 1, 1, 0};
        int k = 2;
        function(input, k);


    }

    private static void function(final int[] input, final int k) {
        int maxSize = 0;
        int left = 0, right = 0, zeros = 0;
        while (right < input.length) {
            if (input[right] == 0) {
                zeros++;
            }
            while (zeros > k) {
                if (input[left] == 0) {
                    zeros--;
                }
                left++;
            }
            maxSize = Math.max(maxSize, right - left + 1);
            right++;
        }


        System.out.println(maxSize);

    }
}
