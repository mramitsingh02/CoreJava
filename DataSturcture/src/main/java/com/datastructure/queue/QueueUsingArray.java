package com.datastructure.queue;

public class QueueUsingArray implements CustomQueue {
    private final int[] internalQueue;
    private final int capacity;
    private int front;
    private int rear;
    private int currentSize;

    public QueueUsingArray(int capacity) {
        this.capacity = capacity;
        this.internalQueue = new int[capacity];
        front = 0;
        rear = -1;
        currentSize = 0;
    }

    @Override
    public void put(int value) {
        if (isFull()) {
            System.out.println("Queue is full....");
        } else {
            rear++;
            if (rear == capacity) {
                rear = 0;
            }
            internalQueue[rear] = value;
            currentSize++;
        }
    }

    @Override
    public int get() {

        if (isEmpty()) {
            System.out.println("Queue is empty....");
            // throw new RuntimeException("Element not found.");
            return 0;
        } else {
            int returnValue = 0;
            front++;
            if (front == capacity) {
                returnValue = internalQueue[front - 1];
                front = 0;
            } else {
                returnValue = internalQueue[front - 1];
            }
            currentSize--;
            return returnValue;
        }
    }

    @Override
    public void print() {
        for (int i = 0; i < currentSize; i++) {
            System.out.println(internalQueue[i]);
        }
    }

    @Override
    public boolean isEmpty() {
        return currentSize == 0;
    }

    @Override
    public boolean isFull() {
        return currentSize == capacity;
    }

    @Override
    public int size() {
        return currentSize;
    }
}
