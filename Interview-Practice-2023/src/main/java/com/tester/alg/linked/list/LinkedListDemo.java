package com.tester.alg.linked.list;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> custom = new LinkedList<>();
        custom.addHeadNode(12);
        custom.add(13);
        custom.add(14);
        custom.add(16);
        custom.insetBefore(15, 16);
        custom.insetAfter(17, 16);
        custom.insetAfter(19, 17);
        custom.insetBefore(18, 19);
        custom.inset(6, 0);
        custom.inset(5, 0);
        custom.inset(7, 3);
        custom.print();
        System.out.println();
        custom.remove(7);
        custom.print();
        System.out.println();
        custom.remove(16);
        custom.print();
    }
}
