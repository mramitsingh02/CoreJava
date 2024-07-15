package org.example;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String input = "abcabcbb";

        System.out.println(findLongestSubstring(input.toCharArray()));
    }

    private static int findLongestSubstring(char[] inputCharArray) {
        int left = 0;
        int right = 0;
        int maxSum = 0;
        Map<Character, Integer> map = new HashMap<>();
        while (right < inputCharArray.length) {

            if (map.containsKey(inputCharArray[right])) {
                map.put(inputCharArray[right], right);
                left++;
            }

            map.put(inputCharArray[right], right);
            maxSum = Math.max(maxSum, (right - left + 1));

            right++;
        }

        return maxSum;
    }
}
