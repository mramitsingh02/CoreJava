package com.tester.corejava.datastucture.linkedlis;


public class CustomLinkedListDemo {
    public static void main(String[] args) {
        CustomeLinkedList<String> linkedList = new CustomeLinkedList<>();
        CustomeLinkedList.Node<String> root = linkedList.addHead("Amit");
        linkedList.add("Singh");
        linkedList.add("Sanu");
        linkedList.add("Sivam");
        linkedList.add("Omm");
        linkedList.add("Arpit");
        linkedList.add("Ragaw");


        linkedList.display(root);
    }
}
