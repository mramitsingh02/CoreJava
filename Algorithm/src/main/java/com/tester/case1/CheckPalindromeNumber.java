package com.tester.case1;

public class CheckPalindromeNumber {
    public static void main(String[] args) {
        int number = 121;
        CheckPalindromeNumber checkPalindromeNumber = new CheckPalindromeNumber();
        if (checkPalindromeNumber.check(number)) {
            System.out.format("%d is palindrome number.", number);
        } else {
            System.out.format("%d is not palindrome number.", number);
        }


    }

    public boolean check(final int palindromeNumber) {
        int inputNumber = palindromeNumber;

        int newNumber = 0;
        while (inputNumber != 0) {
            int temp = inputNumber % 10;
            newNumber = newNumber * 10 + temp;
            inputNumber = inputNumber / 10;
        }
        if (newNumber == palindromeNumber) {
            return true;
        }
        return false;
    }



}
