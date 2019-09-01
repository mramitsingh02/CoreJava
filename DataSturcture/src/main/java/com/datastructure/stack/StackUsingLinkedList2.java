package com.datastructure.stack;


public class StackUsingLinkedList2 extends SortStackUsingStack implements CustomStack {
    private Node rootNode;

    public StackUsingLinkedList2() {
    }

    @Override
    public boolean isEmpty() {
        return rootNode == null;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public int peek() {
        if (rootNode == null) {
            System.out.println("Stack Is Empty");
            return -1;
        }
        Node returnNode = rootNode;
        return returnNode.value;
    }

    public void push(int value) {
        if (rootNode == null) {
            rootNode = newNode(value);
        } else {
            Node oldNode = rootNode;
            rootNode = newNode(value);
            rootNode.next = oldNode;
        }
    }

    private Node newNode(int value) {
        return new Node(value);
    }


    public int pop() {
        if (rootNode == null) {
            System.out.println("Stack Is Empty");
        }
        Node returnNode = rootNode;
        rootNode = rootNode.next;
        return returnNode.value;
    }

    public void print() {
        if (rootNode == null) {
            System.out.println("Stack is Empty.");
        }
        Node temp = rootNode;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    private static class Node {
        private final int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    '}';
        }
    }
}
