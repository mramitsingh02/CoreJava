package com.tester.algorithm.array;

import com.tester.sort.SortUtils;

public class FindElementInArray {
    public static void main(String[] args) {
        FindElementInArray thisInstance = new FindElementInArray();
        thisInstance.find(SortUtils.elements, 5);
        System.out.println();
    }

    public int find(int[] elements, int searchValue) {

        int result = ArrayUtils.findPivot(elements, 0, elements.length);


        return 0;
    }


}
