package com.tester.algorithm.stack;

public class ArrayStack {
    private final int size;
    int top = -1;
    private int[] stack;

    public ArrayStack(int size) {
        this.size = size;
        stack = new int[size];
    }

    public static void main(String[] args) {
        ArrayStack thisInstance = new ArrayStack(5);
        thisInstance.push(10);
        thisInstance.push(3);
        thisInstance.push(12);
        thisInstance.push(14);
        thisInstance.print();
        thisInstance.pop();
        thisInstance.print();

    }

    public void push(int item) {
        if (top != size) {
            stack[++top] = item;
        } else {
            System.out.println("Stack is full");
        }
    }

    public int pop() {
        if (top != -1) {
            return stack[top--];
        }
        return -1;
    }

    public void print() {
        for (int i = 0; i < top + 1; i++) {
            System.out.print(stack[i]);
            System.out.print(",");
        }
        System.out.println();
    }


}
