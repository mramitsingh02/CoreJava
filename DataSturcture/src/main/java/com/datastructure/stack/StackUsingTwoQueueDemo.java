package com.datastructure.stack;

public class StackUsingTwoQueueDemo {
    public static void main(String[] args) {
        CustomStack stack = new StackUsingTwoQueue();
        stack.push(12);
        stack.push(13);
        stack.push(14);
        stack.push(15);
        stack.push(16);
        stack.print();



        System.out.println("======================================");
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println("======================================");

        stack.print();

        stack.pop();
        stack.pop();
        System.out.println("======================================");
        stack.print();

    }
}
