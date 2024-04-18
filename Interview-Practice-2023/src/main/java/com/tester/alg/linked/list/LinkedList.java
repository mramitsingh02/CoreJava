package com.tester.alg.linked.list;

import static java.util.Objects.nonNull;

public class LinkedList<T> {
    private Node<T> headNode;

    public void addHeadNode(T value) {
        if (headNode == null) {
            headNode = new Node<>(value);
        }
    }

    public void add(T value) {
        if (headNode == null) {
            headNode = new Node<>(value);
        }
        Node<T> currentHead = headNode;
        Node<T> currentNode = null;
        while (currentHead != null) {
            currentNode = currentHead;
            currentHead = currentHead.getNextNode();
        }
        currentNode.setNextNode(new Node<>(value));
    }
    public T remove(T value) {
        Node<T> firstPointer = headNode;
        Node<T> secondPointer = headNode;
        while (firstPointer != null) {
            firstPointer = firstPointer.getNextNode();

            if (value.equals(firstPointer.getValue())) {
                secondPointer.setNextNode(firstPointer.getNextNode());
                break;
            }

            secondPointer = secondPointer.getNextNode();
        }
        return null;
    }

    public void insetBefore(T value, T searchValue) {
        final Node<T> newNode = new Node<>(value);
        if (headNode == null) {
            headNode = newNode;
            return;
        }
        Node<T> firstPointer = headNode;
        Node<T> secondPointer = headNode;
        while (firstPointer != null) {
            firstPointer = firstPointer.getNextNode();

            if (searchValue.equals(firstPointer.getValue())) {
                Node<T> nextNode = firstPointer;
                newNode.setNextNode(nextNode);
                secondPointer.setNextNode(newNode);
                break;
            }

            secondPointer = secondPointer.getNextNode();
        }
    }

    public void inset(T value, int index) {
        int count = 1;
        final Node<T> newNode = new Node<>(value);
        if (headNode == null) {
            headNode = newNode;
            return;
        }

        if (index == 0) {
            newNode.setNextNode(headNode);
            headNode = newNode;
            return;
        }


        Node<T> firstPointer = headNode;
        Node<T> secondPointer = headNode;
        while (firstPointer != null) {
            firstPointer = firstPointer.getNextNode();
            if (index == ++count) {
                Node<T> nextNode = secondPointer.getNextNode();
                newNode.setNextNode(nextNode);
                secondPointer.setNextNode(newNode);
                break;
            }
            secondPointer = secondPointer.getNextNode();
        }
    }

    public void insetAfter(T value, T searchValue) {
        final Node<T> newNode = new Node<>(value);
        if (headNode == null) {
            headNode = newNode;
            return;
        }
        Node<T> currentHead = headNode;
        Node<T> currentNode = null;
        while (currentHead != null) {

            if (searchValue.equals(currentHead.getValue())) {
                currentNode = currentHead;
                currentNode.setNextNode(newNode);
                break;
            }

            currentHead = currentHead.getNextNode();
        }
    }

    public void print() {
        Node<T> currentHead = headNode;
        while (currentHead != null) {
            System.out.print(currentHead.getValue());
            currentHead = currentHead.getNextNode();
            if (nonNull(currentHead)) {
                System.out.print("-->");
            }
        }

    }
}
