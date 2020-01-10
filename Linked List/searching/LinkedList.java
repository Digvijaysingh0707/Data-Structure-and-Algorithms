package com.company;

import org.w3c.dom.Node;
class LinkedList {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void push(int data) {
        Node nn = new Node(data);
        nn.next = head;
        head = nn;
    }

    public boolean search(Node head, int x) {
        Node current = head;
        while (current != null) {
            if (current.data == x)
                return true;
                current = current.next;
        }
        return false;

    }



}







