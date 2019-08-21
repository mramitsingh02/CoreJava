package com.tester.algorithm.array;

import com.tester.sort.SortUtils;

import java.util.Arrays;

public class DuplicateElement {
    public static void main(String[] args) {
        DuplicateElement thisInstance = new DuplicateElement();
        int[] ints = thisInstance.findDuplicate(SortUtils.DUPLICATE_ELEMENTS);
        SortUtils.print(ints);
    }

    public int[] findDuplicate(int[] duplicateElements) {
        int max = SortUtils.maxValue(duplicateElements);
        int range = max + 1;
        int[] count = new int[range];

        for (int i = 0; i < duplicateElements.length; i++) {
            ++count[duplicateElements[i]];
        }
        SortUtils.print(duplicateElements);
        SortUtils.print(count);
        int[] ints = new int[count.length - 1];
        int j = 0;
        //9(0), 3(1), 2(2), 7(3), 5(4), 11(5), 3(6), 5(7), 9(8)
        //
        for (int i = count.length - 1; i >= 0; i--) {
            if (count[i] > 1) {
                ints[j] = duplicateElements[i -1];
//                count[i]--;
                j++;
            }
        }
        SortUtils.print(ints);

        return Arrays.copyOfRange(ints, 0, j);
    }


}
