package org.example;

public class MostWater {
    public static int maxWater(int[] heights) {
        int leftIndex = 0;
        int rightIndex = heights.length - 1;
        int maxArea = 0;
        while (leftIndex < rightIndex) {
            int width = rightIndex - leftIndex;
            int leftHeight = heights[leftIndex];
            int rightHeight = heights[rightIndex];
            int minHeight = Math.min(leftHeight, rightHeight);
            int area = width * minHeight;
            maxArea = Math.max(area, maxArea);
            if (leftHeight <= rightHeight) {
                leftIndex += 1;
            } else {
                rightIndex -= 1;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] heights = {1, 2, 3, 4, 5};
        int maxArea = maxWater(heights);
        System.out.println("Max Water Area: " + maxArea);
    }
}
