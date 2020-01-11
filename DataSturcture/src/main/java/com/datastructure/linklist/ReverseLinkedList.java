package com.datastructure.linklist;

import com.datastructure.utils.Node;

public class ReverseLinkedList implements CustomLinkedList {
    private Node rootNode;
    private int currentSize;

    @Override
    public void add(int value) {
        if (rootNode == null) {
            rootNode = new Node(value);
        } else {
            Node lastNode = rootNode;
            while (lastNode.getNext() != null) {
                lastNode = lastNode.getNext();
            }
            lastNode.setNext(new Node(value));

        }
        currentSize++;
    }

    @Override
    public int getLast() {
        Node previousNode = null;
        Node lastNode = rootNode;
        while (lastNode != null) {
            if (lastNode.getNext() != null) {
                previousNode = lastNode;
            }
            lastNode = lastNode.getNext();
        }
        if (previousNode != null) {
            return previousNode.getValue();
        }

        return 0;
    }

    @Override
    public boolean contains(int value) {
        Node lastNode = rootNode;
        while (lastNode.getNext() != null) {
            if (lastNode.getValue() == value) {
                return true;
            }
            lastNode = lastNode.getNext();
        }
        return false;
    }

    @Override
    public int size() {
        return currentSize;
    }

    @Override
    public int remove() {
        Node previousNode = null;
        Node lastNode = rootNode;
        while (lastNode != null) {
            if (lastNode.getNext() != null) {
                previousNode = lastNode;
            }
            lastNode = lastNode.getNext();
        }
        int value = 0;
        if (previousNode != null) {
            value = previousNode.getNext().getValue();
            previousNode.setNext(null);
            currentSize--;
        }
        return value;
    }


    public Node remove(Node node) {
        Node previousNode = null;
        Node lastNode = node;
        Node returnNode = null;
        while (lastNode != null) {
            if (lastNode.getNext() != null) {
                previousNode = lastNode;
            }
            lastNode = lastNode.getNext();
        }
        int value = 0;
        if (previousNode != null) {
            returnNode = previousNode.getNext();
            previousNode.setNext(null);
        }
        return returnNode;
    }

    @Override
    public void print() {
        Node lastNode = rootNode;
        while (lastNode != null) {
            System.out.println("Print:" + lastNode.getValue());
            lastNode = lastNode.getNext();
        }

    }

    public Node getRootNode() {
        return rootNode;
    }

    public void reverse(Node rootNode) {

        Node previous = null;
        Node current = rootNode;
        Node next = null;

        while (current != null) {
            next = current.getNext();
            current.setNext(previous);
            previous = current;
            current = next;
        }

        Node lastNode = previous;
        while (lastNode != null) {
            System.out.println("Reverse:" + lastNode.getValue());
            lastNode = lastNode.getNext();
        }




    }


/*
        public Node reverse() {
            Node newRootNode = null;
            int reverseCount = currentSize;
            Node root = rootNode;
            while (reverseCount != 0){
            Node previousNode = remove(root);
                if (newRootNode == null) {
                    newRootNode = previousNode;
                } else {
                    Node newLastNode = newRootNode;
                    while (newLastNode != null) {
                        if (newLastNode.getNext() != null) {
                            previousNode = newLastNode;
                        }
                        newLastNode = newLastNode.getNext();
                    }
                    newLastNode = previousNode.getNext();
                }
                reverseCount--;
            }

            Node tmp = newRootNode;
            while (tmp != null) {
                System.out.println("Reversed : " + tmp.getValue());
                tmp = tmp.getNext();
            }

            return newRootNode;
        }*/

    private Node getPreviousNode() {
        Node previousNode = null;
        Node lastNode = rootNode;
        while (lastNode != null) {
            if (lastNode.getNext() != null) {
                previousNode = lastNode;
            }
            lastNode = lastNode.getNext();
        }
        return previousNode;
    }

}
