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
            return;
        }
        if (rear == capacity - 1) {
            rear = 0;
        }

        currentSize++;
        internalQueue[front++] = value;
    }

    @Override
    public int get() {

        if (isEmpty()) {
            System.out.println("Queue is empty....");
            return -1;
        } else {

            int returnValue = internalQueue[++rear];
            if (front == capacity - 1) {
                front = 0;
            }
            currentSize--;
            return returnValue;
        }
    }

    @Override
    public void print() {
        for (int i = rear + 1; i < front; i++) {
            System.out.println(internalQueue[i]);
        }
    }

    @Override
    public boolean isEmpty() {
        return currentSize == 0;
    }

    @Override
    public boolean isFull() {
        return front == capacity;
    }

    @Override
    public int size() {
        return currentSize;
    }
}
