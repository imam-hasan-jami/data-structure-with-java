package DataStructure;

import java.util.*;

public class dsLinkedList {

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // add - first, last
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // print
    public void printList() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        dsLinkedList ll = new dsLinkedList();
        ll.addFirst("a");
        ll.addFirst("is");
        ll.printList();

        ll.addLast("list");
        ll.printList();

        ll.addFirst("this");
        ll.printList();
    }
}
