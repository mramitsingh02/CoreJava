package com.tester.algorithm.array;

import com.tester.sort.SortUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

import static com.tester.algorithm.array.ArrayUtils.printArrayElement;

class ArrayRotationTest {
    ArrayRotation arrayRotation;

    @BeforeEach
    void setUp() {
        arrayRotation = new ArrayRotation();

    }

    @Test
    void rotate() {
        int[] ints = SortUtils.getElements();
        int[] elements = SortUtils.getElements();
        arrayRotation.rotate(ints, 4);
        Assertions.assertNotEquals(elements[0], ints[0]);
        Assertions.assertNotEquals(elements[1], ints[1]);
        Assertions.assertNotEquals(elements[2], ints[2]);
        Assertions.assertNotEquals(elements[4], ints[4]);
        printArrayElement("Orignal Array", elements);
        printArrayElement("After Rotation", ints);
        Assertions.assertEquals(elements[0], ints[4]);
        Assertions.assertEquals(elements[elements.length - 4], ints[0]);


    }

}