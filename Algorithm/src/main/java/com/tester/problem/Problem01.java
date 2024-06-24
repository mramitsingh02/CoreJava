package com.tester.problem;

import com.google.common.base.Strings;

public class Problem01 {
    public static void main(String[] args) {
/*
        for (int i = 5; i > 0; i--) {

            System.out.print(Strings.repeat("*", i));
            System.out.println();
        }

*/

        for (int i = 5; i > 0; --i) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
