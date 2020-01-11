package com.datastructure.utils;

import java.util.Objects;

public class Node {
    private final int value;
    private Node next;

    public Node(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return value == node.value &&
                next.equals(node.next);
    }


    public int getValue() {
        return value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, next);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Node[" + value + ']');
        if(next != null){
            sb.append("->");
            sb.append("[").append(next).append("]");
        }
        return sb.toString();
    }
}
