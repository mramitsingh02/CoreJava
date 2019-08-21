package com.tester.case1;

public class DuplicateStringCountUsing2DArrayMainClass {
    public static void main(String[] args) {
        String input = "sdfsasdfasdrtyrtybbmbnmbnmbhilyuoxcfvsdgfyjhCvkjdhvj;aofk;awioeurt8347tfn,.xmcn xcmnkzdjhgeoritn xcm,nvbxckjfsf";
        System.out.println(duplicateCount(input));
    }

    public static String duplicateCount(String input) {

        char[] charArray = input.toCharArray();
        int xSize = charArray.length;
        int ySize = 2;

        int[][] result = new int[xSize][ySize];
        fill(result, xSize, ySize);

        int arrayFillSize = 0;
        for (int index = 0; index < xSize; index++) {
            char c = charArray[index];
            int currentIndex;
            if ((currentIndex = findValueInArray(result, c, xSize)) != -1) {
                result[currentIndex][1] = result[currentIndex][1] + 1;
            } else {
                result[arrayFillSize][0] = (int) c;
                result[arrayFillSize][1] = 1;
                arrayFillSize++;
            }
        }

        display(result, xSize, ySize);

        return "";
    }

    private static void display(int[][] result, int xSize, int ySize) {
        for (int i = 0; i < xSize; i++) {
            if(result[i][0] == -1)
                break;
            System.out.println((char)result[i][0] + "=" + result[i][1]);
        }

    }

    private static void fill(int[][] result, int xSize, int ySize) {
        for (int i = 0; i < xSize; i++) {
            for (int j = 0; j < ySize; j++) {
                result[i][j] = -1;
            }
        }

    }

    private static int findValueInArray(int[][] result, int c, int xSize) {
        int currentIndex;
        for (currentIndex = 0; currentIndex < xSize; currentIndex++) {
            int temp = result[currentIndex][0];
            if (temp == -1) {
                break;
            }
            if (temp == c) {
                return currentIndex;
            }
        }

        return -1;
    }


}
