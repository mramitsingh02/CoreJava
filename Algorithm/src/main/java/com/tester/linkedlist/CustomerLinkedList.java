package com.tester.linkedlist;

public class CustomerLinkedList<T> {
    private Node<T> head = null;

    public static void main(String[] args) {

        CustomerLinkedList<Integer> linkedList = new CustomerLinkedList<>();

        linkedList.addToHead(10);
        linkedList.addToHead(20);
        linkedList.addToHead(30);
        linkedList.addToHead(40);
        linkedList.addToHead(50);
        linkedList.insert(7,4);
        linkedList.insert(2,3);
        linkedList.insert(1,1);
        linkedList.print();

    }


    private Node<T> addToHead(T value) {
        if (head == null) {
            head = newLinkedNode(value);
            head.nextNode = null;
            return head;
        } else {
            Node<T> refNode = head;
            while (refNode.hasNextNode()) {
                refNode = refNode.nextNode;
            }

            refNode.nextNode = newLinkedNode(value);
            return refNode;
        }
    }

    private Node<T> insert(T value, int position) {
        if (head == null) {
            head = newLinkedNode(value);
            head.nextNode = null;
            return head;
        }
        Node<T> refNode = head;
        int i = 1;
        while (refNode.hasNextNode() && i <= position - 2) {
            refNode = refNode.nextNode;
            i++;
        }
        Node<T> tNode = refNode.nextNode;

        Node<T> newNode = newLinkedNode(value);
        newNode.nextNode = tNode;
        refNode.nextNode = newNode;


        return refNode;
    }

    private Node<T> newLinkedNode(T value) {
        return new Node<>(value);
    }

    private void print() {
        Node<T> refNode = head;
        if (refNode == null) {
            return;
        }

        while (refNode.hasNextNode()) {
            System.out.println(refNode.value);
            refNode = refNode.nextNode;
        }


    }

    public static class Node<T> {
        private final T value;
        private Node<T> nextNode;

        public Node(T value) {
            this.value = value;
        }

        public Node(T value, Node<T> nextNode) {
            this.value = value;
            this.nextNode = nextNode;
        }

        public boolean hasNextNode() {
            return nextNode != null;
        }
    }

}
