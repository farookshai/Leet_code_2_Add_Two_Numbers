package com.sum_of_linkedlist;

/**
 * for addition of elements of two linked list.
 */
final class SumOfLinkedList {
    /**
     * for addition of elements of two linked list.
     * @param node1head head of first linked list.
     * @param node2head head of second linked list.
     * @return return resultant (addition) of both list.
     */
    public Node additionOfLinkedLists(
            final Node node1head,
            final Node node2head) {
        Node currentNode1 = node1head;
        Node currentNode2 = node2head;
        Node resultHead = null;
        Node resultTail = null;
        int carry = 0;
        while (currentNode1 != null || currentNode2 != null) {
            int valueOfLinkedList1 =
                    (currentNode1 != null) ? currentNode1.getValue() : 0;
            int valueOfLinkedList2 =
                    (currentNode2 != null) ? currentNode2.getValue() : 0;

            int resultSum = valueOfLinkedList1
                    + valueOfLinkedList2
                    + carry;
            carry = resultSum / 10;
            int lastDigitOfResultSum = resultSum % 10;
            Node newNode = new Node(lastDigitOfResultSum);
            // first node push in result list.
            if (resultHead == null) {
                resultHead = newNode;
                resultTail = newNode;
            } else {
                resultTail.setNext(newNode);
                resultTail = newNode;
            }
            if (currentNode1 != null) {
                currentNode1 = currentNode1.getNext();
            }
            if (currentNode2 != null) {
                currentNode2 = currentNode2.getNext();
            }
        }
        if (carry > 0) {
            Node newNode = new Node(carry);
            resultTail.setNext(newNode);
            // because we are not using it in future.
            //resultTail = newNode;
        }
        return resultHead;
    }
}
