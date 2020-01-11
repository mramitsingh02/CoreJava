package com.datastructure.queue;

import com.datastructure.utils.Node;

import java.util.Objects;

public class QueueUsingLinkedList implements CustomQueue {
    private Node headNode;
    private Node tailNode;
    private int currentSize;




    @Override
    public void put(int value) {
        if (Objects.isNull(headNode)) {
            headNode = newNode(value);
            tailNode = headNode;
        } else {
            tailNode.setNext(newNode(value));
            tailNode = tailNode.getNext();
        }
        currentSize++;
    }

    @Override
    public int get() {
        if (isEmpty()) {
            throw new RuntimeException("Element not found.");
        }

        int value = headNode.getValue();
        headNode = headNode.getNext();
        currentSize--;
        return value;
    }

    @Override
    public boolean isEmpty() {
        return headNode == null;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public void print() {
        Node temp = headNode;

        while (temp != null) {
            System.out.println("Value : " + temp.getValue());
            temp = temp.getNext();
        }
    }

    @Override
    public int size() {
        return currentSize;
    }

    private Node newNode(int value) {
        return new Node(value);
    }


}
