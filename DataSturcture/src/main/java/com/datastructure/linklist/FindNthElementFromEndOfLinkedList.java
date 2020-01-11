package com.datastructure.linklist;

import com.datastructure.utils.Node;

public class FindNthElementFromEndOfLinkedList {

    public int findNthElementFromEndOfLinkedList(Node rootNode, int nthPosition) {
        if (rootNode != null) {
            Node slowPointer, fastPointer = null;
            slowPointer = fastPointer = rootNode;
            int fastCount = 1;
            int slowCount = 0;
            while (fastPointer != null) {
                fastPointer = fastPointer.getNext();
                if (fastPointer != null && fastPointer.getNext() != null && nthPosition <= fastCount) {
                    slowPointer = slowPointer.getNext();
                    fastPointer = fastPointer.getNext();
                    slowCount++;
                    fastCount = fastCount * 2;
                }
            }
            int diff = nthPosition - fastCount;

            while (diff != 0) {
                slowPointer = slowPointer.getNext();
                diff--;
            }
            if (diff == 0) {
                return fastPointer.getValue();
            }


        }
        return -1;
    }

}
