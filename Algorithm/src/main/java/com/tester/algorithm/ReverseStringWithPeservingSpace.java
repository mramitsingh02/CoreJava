package com.tester.algorithm;

public class ReverseStringWithPeservingSpace {
    public static void main(String[] args) {
        String name = "Amit Kumar Singh";
        String name2 = "hgni Sramu KtimA";
        char[] charName = name.toCharArray();
        System.out.println(String.valueOf(charName));
        for (int i = 0, j = charName.length-1; i < j; i++, j--) {

            if(charName[i] == ' '){
                i++;
            }
            if(charName[j] == ' '){
                j--;
            }

            if (charName[i] != ' ' && charName[j] != ' ') {
                char temp = charName[j];
                charName[j] = charName[i];
                charName[i] = temp;
            }
        }

        System.out.println(String.valueOf(charName));
        System.out.println(String.valueOf(charName).equals(name2));

    }

}
