package com.datastructure.linklist;

import com.datastructure.utils.Node;

interface CustomLinkedList {

    void add(int value);

    int getLast();

    boolean contains(int value);

    int size();

    int remove();

    void print();

    Node getRootNode();

    void reverse(Node rootNode);
}
