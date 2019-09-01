package com.datastructure.stack;

public class StackUsingArray extends SortStackUsingStack implements CustomStack {
    private final int length;
    private final int[] stackArray;
    private int top = -1;

    public StackUsingArray(int length) {
        this.length = length;
        this.stackArray = new int[length];
    }

    @Override
    public int peek() {
        if (top == -1) {
            System.out.println("Stack Is Empty");
            return -1;
        }
        return stackArray[top];
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public boolean isFull() {
        return top == length;
    }

    @Override
    public void push(int value) {
        if (stackArray.length == top) {
            System.out.println("Stack Is Full");
            return;
        }

        stackArray[++top] = value;


    }

    @Override
    public int pop() {
        if (top == -1) {
            System.out.println("Stack Is Empty");
        }
        return stackArray[top--];
    }

    @Override
    public void print() {
        if (top == -1) {
            System.out.println("Stack is Empty.");
        }
        for (int i = 0; i <= top; i++) {
            System.out.println(stackArray[i] + " ");
        }
    }
}
