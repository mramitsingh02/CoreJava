package com.tester.java8.collection.lambda.case1;

import static java.util.Objects.isNull;

public class LinkedListMainClass {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.add("5");
        linkedList.add("6");
        linkedList.add("7");
        linkedList.add("8");
        linkedList.add("9");

        linkedList.print();

        linkedList.revers();
        linkedList.print();


    }

    private static class LinkedList {
        private Node head;

        public void add(String value) {
            if (isNull(head)) {
                head = new Node(value);
            } else {
                Node curser = head;

                while (curser.nextNode != null) {
                    curser = curser.nextNode;
                }

                curser.nextNode = new Node(value);
            }
        }

        public void print() {

            print(head);


        }

        public void print(Node head) {

            Node curser = head;

            while (curser != null) {
                System.out.print(curser.value + " -> ");
                curser = curser.nextNode;
            }
        }

        public void revers() {

            Node curser = head;
            if (isNull(curser)) {
                System.out.println("No Value for Revers");
                return;
            }

            Node currentNode = curser;
            Node nextNode = head.nextNode;
            currentNode.setNextNode(null);

            while (nextNode != null) {
                Node temp = nextNode;
                nextNode = temp.nextNode;
                temp.setNextNode(currentNode);
            }

            System.out.println();
            print(nextNode);
        }


    }

    private static class Node {
        private String value;
        private Node nextNode;

        public Node(final String value) {
            this.value = value;
        }

        public void setNextNode(final Node nextNode) {
            this.nextNode = nextNode;
        }
    }
}
