package com.tester.case1;

public class CheckPalindromeNumber {
    public static void main(String[] args) {
        int number = 1231;
        CheckPalindromeNumber checkPalindromeNumber = new CheckPalindromeNumber();
        if (checkPalindromeNumber.check(number)) {
            System.out.format("%d is palindrome number.", checkPalindromeNumber);
        } else {
            System.out.format("%d is not palindrome number.", checkPalindromeNumber);
        }


    }

    public boolean check(int palindromeNumber) {
        int inputNumber = palindromeNumber;

        int newNumber = 0;
        while (palindromeNumber != 0) {
            int temp = palindromeNumber % 10;
            newNumber = newNumber * 10 + temp;
            palindromeNumber = palindromeNumber / 10;
        }
        if (newNumber == inputNumber) {
            return true;
        }
        return false;
    }
}
