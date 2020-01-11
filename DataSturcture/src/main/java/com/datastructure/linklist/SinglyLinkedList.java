package com.datastructure.linklist;

import com.datastructure.utils.Node;

public class SinglyLinkedList implements CustomLinkedList {
    private Node rootNode;
    private Node lastNode;
    private int currentSize;

    @Override
    public void add(int value) {
        if (rootNode == null) {
            rootNode = new Node(value);

        } else {
            lastNode = rootNode;

            while (lastNode.getNext() != null) {
                lastNode = lastNode.getNext();
            }
            lastNode.setNext(new Node(value));
            lastNode = lastNode.getNext();
        }
        currentSize++;
    }

    @Override
    public void print() {
        Node tmp = rootNode;
        while (tmp != null) {
            System.out.println(tmp.getValue());
            tmp = tmp.getNext();
        }
    }

    @Override
    public int getLast() {
        int value = 0;
        Node previousNode = null;
        Node currentNode = rootNode;
        while (currentNode.getNext() != null) {
            previousNode = currentNode;
            currentNode = currentNode.getNext();
        }
        if (currentNode != null) {
            value = currentNode.getValue();
            currentNode = previousNode;
        }
        System.out.println("Get: " + value);
        return value;
    }

    @Override
    public boolean contains(int value) {
        Node tmp = rootNode;
        while (tmp != null) {
            if (tmp.getValue() == value) {
                return true;
            }
            tmp = tmp.getNext();
        }
        return false;
    }

    @Override
    public int size() {
        return this.currentSize;
    }

    @Override
    public int remove() {
        int value = 0;
        Node previousNode = null;
        Node currentNode = rootNode;
        while (currentNode != null) {
            if (currentNode.getNext() != null) {
                previousNode = currentNode;
            }
            currentNode = currentNode.getNext();
        }
        if (previousNode != null) {
            value = previousNode.getNext().getValue();
            previousNode.setNext(null);
        }
        System.out.println("Removing: " + value);
        return value;
    }

    @Override
    public Node getRootNode() {
        return rootNode;
    }

    @Override
    public void reverse(Node rootNode) {
        Node previous = null;
        Node current = rootNode;
        Node next = null;

        while (current != null) {
            next = current.getNext();
            current.setNext(previous);
            previous = current;
            current = next;
        }
        Node tmp = previous;
        while (tmp != null) {
            System.out.println("Reverse Number : " + tmp.getValue());
            tmp = tmp.getNext();
        }


    }
}
