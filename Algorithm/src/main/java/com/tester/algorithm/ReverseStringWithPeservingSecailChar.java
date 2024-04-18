package com.tester.algorithm;

public class ReverseStringWithPeservingSecailChar {
    public static void main(String[] args) {
        String name = "S&tr*i$n%g";
        String name2 = "g&ni*r$t%S";

        char[] charName = name.toCharArray();
        System.out.println(String.valueOf(charName));


        for (int i = 0, j = charName.length - 1; i < j; i++, j--) {

            if (hasSpecialChar(charName[i])) {
                i++;
            }
            if (hasSpecialChar(charName[j])) {
                j--;
            }

            if (!hasSpecialChar(charName[i]) && !hasSpecialChar(charName[j])) {
                char temp = charName[j];
                charName[j] = charName[i];
                charName[i] = temp;
            }

        }

        System.out.println(String.valueOf(charName));
        System.out.println(String.valueOf(charName).equals(name2));

    }

    private static boolean hasSpecialChar1(char charName) {
        return charName=='$' || charName=='&' || charName=='%' || charName=='*';
    }

    private static boolean hasSpecialChar(char charName) {
        return Character.isSpaceChar(charName);
    }

}
