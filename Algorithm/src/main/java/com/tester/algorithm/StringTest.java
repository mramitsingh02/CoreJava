package com.tester.algorithm;

public class StringTest {
    public static void main(String[] args) {
//        Given an array of strings, find the longest common prefix
//        Output - flow
//        Input - {"flow"  ,"flower" , "fleowing"}
//        Output - fl
//        String[] input = new String[]{"flow", "flower", "flowing"};
        String[] input = new String[]{"flow"  ,"flower" , "fleowing"};

        System.out.println(findTheLongestCommenPrefix(input));


    }

    private static String findTheLongestCommenPrefix(final String[] inputs) {
        String matchString = "";
        String input = inputs[0];
        char[] words = input.toCharArray();


//        String matchString = "";
        for (int i = 1; i < inputs.length; i++) {

            char[] nextWord = inputs[i].toCharArray();
            for (int j = 0; j < words.length; j++) {
                for (int z = 0; z < nextWord.length; z++) {
                    if (words[j] == nextWord[z]) {
                        matchString += words[j];
                    }

                }
            }
        }
        return matchString;
    }
}
