package com.datastructure.linklist;

import com.datastructure.utils.Node;

public class FindMidElementInLinkedList {
    public int findMidElement(Node rootNode) {

        if(rootNode == null){
            return -1;
        }
        Node slowPointer, fastPointer = null;

        slowPointer = fastPointer = rootNode;


        while (fastPointer != null){
            fastPointer = fastPointer.getNext();
            if(fastPointer !=null && fastPointer.getNext() != null){
                slowPointer = slowPointer.getNext();
                fastPointer = fastPointer.getNext();
            }
        }


        return slowPointer.getValue();
    }



























    /*public int findMidElement(Node rootNode) {
        Node slowPointer = null;
        Node fastPointer = null;
        slowPointer = fastPointer = rootNode;
        if (slowPointer == null) {
            return 0;
        }

        while (fastPointer != null) {
            fastPointer = fastPointer.getNext();
            if (fastPointer != null && fastPointer.getNext() != null) {
                slowPointer = slowPointer.getNext();
                fastPointer = fastPointer.getNext();
            }
        }
        return slowPointer.getValue();
    }
*/

}
