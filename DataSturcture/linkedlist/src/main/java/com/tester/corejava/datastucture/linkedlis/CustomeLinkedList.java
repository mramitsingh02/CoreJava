package com.tester.corejava.datastucture.linkedlis;

import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;

import java.util.Objects;

public class CustomeLinkedList<T> {
    private Node<T> headNode;

    public void add(T _value) {
        Objects.nonNull(_value);

        Node<T> newNode = new Node<>(_value);
        Node<T> tNode = headNode;
        while (tNode !=null){
            if(tNode.nextNode == null){
                tNode.nextNode= newNode;
                break;
            }

            tNode = tNode.nextNode;



        }

    }

    public void display(Node<T> headNode){
        if(Objects.isNull(headNode))
            return;

        Node<T> tNode = headNode;

        while (tNode !=null){
            System.out.print(tNode);
            tNode = tNode.nextNode;
            if(tNode !=null){
                System.out.println("----->");
            }
        }

    }


    public Node<T> addHead(T value){
        Objects.nonNull(value);
        Assert.assertNotNull(value);
        Node<T> newNode = new Node<>(value);
        this.headNode=newNode;
        return this.headNode;
    }

    public Node<T> addHead(Node<T> oldHeadNode, T value){
        if(Objects.isNull(oldHeadNode))
            return addHead(value);

        Node<T> newNode = new Node<>(value);
        newNode.nextNode= oldHeadNode;
        headNode=newNode;
        return this.headNode;
    }




    public static class Node<T>{
        private int paddingLen= 20;

        T _value;
        Node<T> nextNode;

        private Node(T _value, Node<T> nextNode) {
            this._value = _value;
            this.nextNode = nextNode;
        }

        public Node(T _value) {
            this(_value, null);
        }

        @Override
        public String toString() {
            StringBuilder stringBuilder= new StringBuilder();
            stringBuilder.append(StringUtils.leftPad("",paddingLen,"_")).append("\n");
            stringBuilder.append("|"+ StringUtils.leftPad(Objects.toString(_value),paddingLen/2," "));
            stringBuilder.append(StringUtils.leftPad("",(paddingLen/2) -1 ," ")).append("|\n");
            stringBuilder.append(StringUtils.leftPad("",paddingLen,"_")).append("\n");

            return stringBuilder.toString();
        }
    }
}
