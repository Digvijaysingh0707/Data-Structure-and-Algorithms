package com.company;

import org.w3c.dom.Node;

class Linkedlist {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    public void delete(int key) {
        Node temp = head, prev = null;
        if (temp != null && temp.data == key) {
            head = temp.next;
            return;
        }
        if (temp == null) return;
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;

    }

    public void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public void printList() {
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + "->");
            tnode = tnode.next;
            if (tnode == null) {
                System.out.println("null");
            }
        }
    }
}


package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        // write your code here
        /* Start with the empty list */
        Linkedlist llist = new Linkedlist();
        llist.push(1);
        llist.push(5);
        llist.push(7);
        llist.push(2);
        llist.delete(1);
        llist.printList();
    }
}




