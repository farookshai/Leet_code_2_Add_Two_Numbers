package com.sum_of_linkedlist;

/**
 * for storing nodes.
 */
public class Node {
    /**
     * for storing values.
     */
    private final int value;
    /**
     * for storing address of next node.
     */
    private Node next = null;

    /**
     * constructor for storage.
     * @param recievedValue for storing values.
     */
    public Node(final int recievedValue) {
        value = recievedValue;
    }

    /**
     * for setting next pointer.
     * @param recievedNext for storing next node.
     */
    public void setNext(final Node recievedNext) {
        next = recievedNext;
    }

    /**
     * for getting value of node.
     * @return return value.
     */
    public int getValue() {
        return value;
    }

    /**
     * for getting next node.
     * @return return the address of next node.
     */
    public Node getNext() {
        return next;
    }
}
