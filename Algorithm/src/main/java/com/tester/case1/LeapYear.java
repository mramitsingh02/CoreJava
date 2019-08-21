package com.tester.case1;

public class LeapYear {
    public static void main(String[] args) {
        int startYear = 2000, endYear = 2050;
        for (int i = startYear; i < endYear; i++) {
            if (leapYear(i))
                System.out.print(i + " ");
        }
    }

    private static boolean leapYear(int leapYear) {
        if (leapYear % 400 == 0) {
            return true;
        } else if (leapYear % 4 == 0 && leapYear % 100 != 0)
            return true;

        return false;
    }
}
