package com.decoretor.case1;

public class DecoratorDemo {
    public static void main(String[] args) {

        MagicString s = new MagicString("Amit");
        System.out.println("String is ♫"+ s.getString() + "♫ having " + s.countVowel() + " vowels.");


    }
}
