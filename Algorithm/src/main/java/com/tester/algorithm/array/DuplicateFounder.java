package com.tester.algorithm.array;

import com.tester.sort.SortUtils;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateFounder {
    public static void main(String[] args) {
        int[] element = SortUtils.twoTimeDuplicate.clone();

        int currentIndex = 0;
        int foundAnotherIndex = 0;
        int currentValue = element[currentIndex];
        lable1:
        for (int i = 0; i < element.length; i++) {

            if(currentValue == element[i]){
                foundAnotherIndex++;
            }
            if(foundAnotherIndex == 2 ){
                System.out.println("" + element[i]);
                break lable1;
            }
        }


     /*   int currentIndex= 0;
        int foundAnotherIndex= 0;
        for (int i = 0; i < element.length; i++) {
            int currentValue = element[i];
            for (int j = i; j < element.length; j++, currentIndex++) {
                int i1 = element[j];
                boolean isSameValue = currentValue == i1;
                if (isSameValue) ;
                {
                    foundAnotherIndex++;
                }
            }
            if (foundAnotherIndex == 1) {
                System.out.println("Not Duplicate : " + element[currentIndex]);
            }
        }

*/
        printNonDuplicateElement(element);

    }

    private static void printNonDuplicateElement(int[] element) {
        Map<Integer, Boolean> map = new HashMap<>();
        Set<Integer> value = new HashSet<>();
        for (int i : element) {
            map.put(i, value.add(i));
        }

        for (Map.Entry<Integer, Boolean> integerBooleanEntry : map.entrySet()) {
            if (integerBooleanEntry.getValue()) {
                System.out.println(integerBooleanEntry.getKey());
            }
        }
    }
}
