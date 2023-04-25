package com.tester.algorithm.array;

import com.tester.sort.SortUtils;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Find3rdLargestNumber {
    public static void main(String[] args) {
        Find3rdLargestNumber thisInstance = new Find3rdLargestNumber();
        int position = 3;
        int number = thisInstance.largestNumber(SortUtils.DUPLICATE_ELEMENTS, position);
        SortUtils.print(SortUtils.DUPLICATE_ELEMENTS);
        System.out.println(position + "th Largest Number is : " + number);

        int number2 = thisInstance.largestNumber8(SortUtils.DUPLICATE_ELEMENTS, position);
        SortUtils.print(SortUtils.DUPLICATE_ELEMENTS);
        System.out.println(position + "th Largest Number is : " + number2);


    }

    public int largestNumber8(int[] elements, int position) {
        Map<Integer, Integer> integerMap = Arrays.stream(elements).mapToObj(Integer::valueOf)
                .sorted(Integer::compare)
                .collect(Collectors.toMap(Function.identity(), x -> 1, Integer::sum));
        System.out.println(integerMap);


        for (Integer integer : integerMap.keySet()) {
            position--;
            if (position == 0) {
                return integer;
            }

        }
        return -1;
    }

    public int largestNumber(int[] elements, int position) {
        int max = SortUtils.maxValue(elements);
        int[] maxArray = new int[max + 1];
        for (int i = 0; i < elements.length; i++) {
            maxArray[elements[i]]++;
        }
        for (int index = maxArray.length - 1; index >= 0 && position > 0; index--) {
            if (maxArray[index] > 0) {
                position--;
                if (position == 0) {
                    return index;
                }
            }
        }
        return -1;
    }
}
