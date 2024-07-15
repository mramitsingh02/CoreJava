package com.java11.problem.case01;


import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

 class CollectionTest {

    public void test() {
        List sampleList = Arrays.asList("Java", "Kotlin");
        String[] sampleArray = (String[]) sampleList.toArray(String[]::new);
        assertEquals(sampleArray[0], "Java");
        assertEquals(sampleArray[1], "Kotlin");
    }


}