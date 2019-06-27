package com.tester.corejava.com.tester.jool;


import org.jooq.lambda.function.Function1;
import org.jooq.lambda.function.Function2;
import static org.junit.Assert.assertEquals;

public class FirstProgram {
    public static void main(String[] args) {
        Function2<Integer, Integer, Integer> addTwoNumbers = (v1, v2) -> v1 + v2;
        Function1<Integer, Integer> addToTwo = addTwoNumbers.applyPartially(2);

        Integer result = addToTwo.apply(5);

        System.out.println(result);

        assertEquals(result, (Integer) 7);
    }
}
