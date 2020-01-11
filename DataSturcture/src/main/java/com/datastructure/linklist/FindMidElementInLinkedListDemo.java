package com.datastructure.linklist;

public class FindMidElementInLinkedListDemo {
    public static void main(String[] args) {
        ReverseLinkedList thisInstance = new ReverseLinkedList();
        thisInstance.add(10);
        thisInstance.add(11);
        thisInstance.add(12);
        thisInstance.add(13);
        thisInstance.add(14);
        FindMidElementInLinkedList findMidElementInLinkedList = new FindMidElementInLinkedList();
        System.out.println(findMidElementInLinkedList.findMidElement(thisInstance.getRootNode()));
        FindNthElementFromEndOfLinkedList findNthElementFromEndOfLinkedList = new FindNthElementFromEndOfLinkedList();
        int nthElementFromEndOfLinkedList = findNthElementFromEndOfLinkedList.findNthElementFromEndOfLinkedList(thisInstance.getRootNode(), 1);
        System.out.println(nthElementFromEndOfLinkedList);

    }
}
