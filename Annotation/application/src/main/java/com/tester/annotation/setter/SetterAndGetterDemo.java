package com.tester.annotation.setter;

import java.lang.reflect.Method;

public class SetterAndGetterDemo {
    public static void main(String[] args) {
        Student student = new StudentBuilder().firstName("Amit").lastName("Singh").isPass(true).roll(123).build();
        System.out.println(student);
/*        for (Field declaredField : student.getClass().getDeclaredFields()) {
            generateSetter(declaredField);
            generateGetter(declaredField);
            //      System.out.println(declaredField.getType() + " = " + declaredField.getName());
        }*/
        System.out.println("_______________________________");
        for (Method method : student.getClass().getDeclaredMethods()) {
            System.out.println(method);
        }
        

    }
}
