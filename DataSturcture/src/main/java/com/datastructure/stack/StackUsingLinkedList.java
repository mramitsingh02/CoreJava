package com.datastructure.stack;


public class StackUsingLinkedList extends SortStackUsingStack implements CustomStack {
    private Node rootNode;
    private Node lastNode;

    public StackUsingLinkedList() {
    }

    @Override
    public boolean isEmpty() {
        return rootNode == null;
    }

    @Override
    public int peek() {
        if (lastNode == null) {
            System.out.println("Stack Is Empty");
            return -1;
        }
        Node returnNode = lastNode;
        return returnNode.value;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    public void push(int value) {
        if (rootNode == null) {
            rootNode = newNode(value);
            lastNode = rootNode;
        } else {
            lastNode.next = newNode(value, lastNode);
            lastNode = lastNode.next;
        }
    }

    private Node newNode(int value) {
        return new Node(value);
    }

    private Node newNode(int value, Node previous) {
        return new Node(value, previous);
    }

    public int pop() {
        if (lastNode == null) {
            System.out.println("Stack Is Empty");
        }
        Node returnNode = lastNode;
        lastNode = lastNode.previous;
        return returnNode.value;
    }

    public void print() {
        if (lastNode == null) {
            System.out.println("Stack is Empty.");
        }
        Node temp = lastNode;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.previous;
        }
    }

    private static class Node {
        private final int value;
        private Node previous;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node previous) {
            this(value);
            this.previous = previous;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    '}';
        }
    }
}
