package com.datastructure.stack;

public interface CustomStack {
    public void push(int value);

    public int pop();

    public void print();

    public boolean isEmpty();

    public boolean isFull();

    public CustomStack sort(CustomStack customStack);

    public int peek();


}
