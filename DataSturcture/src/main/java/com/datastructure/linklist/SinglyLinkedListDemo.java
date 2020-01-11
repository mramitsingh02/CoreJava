package com.datastructure.linklist;

public class SinglyLinkedListDemo {
    public static void main(String[] args) {
        SinglyLinkedList thisInstance = new SinglyLinkedList();
        thisInstance.add(10);
        thisInstance.add(11);
        thisInstance.add(12);
        thisInstance.add(13);
        System.out.println("======================================");
        thisInstance.print();
        System.out.println("======================================");
        thisInstance.getLast();
        thisInstance.remove();
        thisInstance.remove();
        thisInstance.remove();
        System.out.println("======================================");
        thisInstance.print();
        System.out.println("======================================");
        thisInstance.add(25);
        thisInstance.add(35);
        thisInstance.add(45);
        thisInstance.add(55);
        System.out.println("======================================");
        thisInstance.print();
        System.out.println("======================================");

    }
}
