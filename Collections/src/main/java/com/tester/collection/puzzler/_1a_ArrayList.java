package com.tester.collection.puzzler;

import java.util.Arrays;
import java.util.List;

public class _1a_ArrayList {
    public static void main(String[] args) {
        String[] stringArray = {"one", "two", "three"};
        var stringList = Arrays.asList(stringArray);

        int[] intArray = {1, 2, 3};
        var intList = (List<int[]>) Arrays.asList(intArray);

        System.out.print(stringList.contains("one") + " ," + intList.contains(1));

        //Options
        //1. true, false
        //2. true, true
        //3. false, true
        //4. None of the above
    }

    //Answer
    //true, false (1)

}
