package com.sum_of_linkedlist;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * for input from user.
 */
final class Main {
    /**
     * for input from user.
     * @param args for input from command line.
     */
    public static void main(final String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Node node1head = null;
            Node node2head = null;
           char choice = 'y';
           // for first linked list.
           while (choice == 'y') {
               System.out.print("\nEnter digit of number"
                       + " for linked list 1: ");
               Node newNode = new Node(scanner.nextInt());
               if (node1head != null) {
                   newNode.setNext(node1head);
               }
               node1head = newNode;
               System.out.print("\nDo you want to continue y/n : ");
               choice = scanner.next().charAt(0);
               while (choice != 'y' && choice != 'n') {
                   System.out.print("\nWrong input " + choice);
                   System.out.print("\nDo you want to continue y/n : ");
                   choice = scanner.next().charAt(0);
               }
           }
           choice = 'y';
           // for second linked list.
            while (choice == 'y') {
                System.out.print("\nEnter digit of number "
                        + "for linked list 2: ");
                Node newNode = new Node(scanner.nextInt());
                if (node2head != null) {
                    newNode.setNext(node2head);
                }
                node2head = newNode;
                System.out.print("\nDo you want to continue y/n : ");
                choice = scanner.next().charAt(0);
                while (choice != 'y' && choice != 'n') {
                    System.out.print("\nWrong input " + choice);
                    System.out.print("\nDo you want to continue y/n : ");
                    choice = scanner.next().charAt(0);
                }
            }
            //for printing linked list 1
            Node currentNode = node1head;
            System.out.print("\nLinked List1: ");
            while (currentNode != null) {
                System.out.print(currentNode.getValue() + "\t");
                currentNode = currentNode.getNext();
            }
            //for printing linked list 2
            currentNode = node2head;
            System.out.print("\nLinked List2: ");
            while (currentNode != null) {
                System.out.print(currentNode.getValue() + "\t");
                currentNode = currentNode.getNext();
            }
            SumOfLinkedList sumOfLinkedList = new SumOfLinkedList();
            currentNode = sumOfLinkedList.additionOfLinkedLists(node1head,
                    node2head);
            // for printing result linkedlist
            System.out.print("\nResult linked list: ");
            while (currentNode != null) {
                System.out.print(currentNode.getValue() + "\t");
                currentNode = currentNode.getNext();
            }

        } catch (InputMismatchException exception) {
            System.out.println(
                    "Input mismatch enter integer only! "
                            + "\n Log: " + exception);
        } catch (Exception exception) {
            System.out.println("Exception occur: " + exception);
        }
    }
    private Main() {
        //Utility classes should not have a public or default constructor.
    }
}
