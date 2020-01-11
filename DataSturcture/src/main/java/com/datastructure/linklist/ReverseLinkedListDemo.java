package com.datastructure.linklist;

public class ReverseLinkedListDemo {
    public static void main(String[] args) {
        ReverseLinkedList thisInstance = new ReverseLinkedList();
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
        thisInstance.reverse(thisInstance.getRootNode());
    }
}
