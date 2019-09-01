package com.datastructure.stack;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class StackUsingTwoQueue extends SortStackUsingStack implements CustomStack {
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    public StackUsingTwoQueue() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    @Override
    public boolean isEmpty() {
        return queue1.isEmpty();
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public int peek() {
        return queue1.peek();
    }

    @Override
    public void push(int value) {
        if (queue1.size() == 0) {
            queue1.add(value);
        } else {
            int queueSize = queue1.size();
            for (int i = 0; i < queueSize; i++) {
                queue2.add(queue1.remove());
            }
            queue1.add(value);

            for (int i = 0; i < queueSize; i++) {
                queue1.add(queue2.remove());
            }
        }
    }

    @Override
    public int pop() {
        if (queue1.size() == 0) {
            System.out.println("Queue is Empty.");
            return -1;
        }
        return queue1.remove();
    }

    @Override
    public void print() {


        Iterator<Integer> iterator = queue1.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
