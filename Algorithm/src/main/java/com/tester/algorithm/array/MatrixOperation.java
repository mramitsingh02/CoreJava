package com.tester.algorithm.array;

import com.tester.sort.SortUtils;

public class MatrixOperation {
    public static void main(String[] args) {
        MatrixOperation thisInstance = new MatrixOperation();
        int xSize = 3;
        int ySize = 3;

        int[][] m1 = SortUtils.matrix(xSize, ySize);
        int[][] m2 = SortUtils.matrix(xSize, ySize);
        int[][] sum = thisInstance.add(m1, m2, xSize, ySize);
        SortUtils.print(sum, xSize, ySize);
        System.out.println("======================================");
        int[][] multiply = thisInstance.multiply(m1, m2, xSize, ySize);
        SortUtils.print(multiply, xSize, ySize);


        System.out.println("======================================");
        int[][] subtract = thisInstance.subtract(multiply, sum, xSize, ySize);
        SortUtils.print(subtract, xSize, ySize);




    }

    public int[][] add(int[][] m1, int[][] m2, int xSize, int ySize) {
        int[][] sum = new int[xSize][ySize];
        for (int i = 0; i < xSize; i++) {
            for (int j = 0; j < ySize; j++) {
                sum[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return sum;
    }

    public int[][] subtract(int[][] m1, int[][] m2, int xSize, int ySize) {
        int[][] sum = new int[xSize][ySize];
        for (int i = 0; i < xSize; i++) {
            for (int j = 0; j < ySize; j++) {
                sum[i][j] = m1[i][j] - m2[i][j];
            }
        }
        return sum;
    }

    public int[][] multiply(int[][] m1, int[][] m2, int xSize, int ySize) {
        int[][] multiple = new int[xSize][ySize];
        int[][] sum = new int[xSize][ySize];
        for (int i = 0; i < xSize; i++) {
            for (int j = 0; j < ySize; j++) {
                sum[i][j] = 0;
                for (int k = 0; k < xSize; k++) {
                    sum[i][j] += m1[i][k] * m2[k][j];
                }

            }
        }
        return sum;
    }


}
