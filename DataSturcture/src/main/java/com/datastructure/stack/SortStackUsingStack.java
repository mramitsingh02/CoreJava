package com.datastructure.stack;

public class SortStackUsingStack {
    public CustomStack sort(CustomStack customStack) {
        CustomStack temp = new StackUsingArray(10);
        while (!customStack.isEmpty()) {
            int item = customStack.pop();
            while (!temp.isEmpty() && temp.peek() > item) {
                customStack.push(temp.pop());
            }
            temp.push(item);
        }
        return temp;
    }

}
