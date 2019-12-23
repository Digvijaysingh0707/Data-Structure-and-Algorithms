package com.company;

public class LinkedList {
    private class Node {
        int data;
        Node next;
    }

    private Node head;
    private Node tail;
    private int size;


    public void display() {
        System.out.println("---------------");
        Node temp = this.head;// this keyword make sure that head is from class Linked List
        while (temp != null) {
            System.out.print(temp.data + " ,");
            temp = temp.next;
        }
        System.out.println(".");
        System.out.println("------------------");
    }
    public void addLast(int item){
        //create new node
        Node nn = new Node();
        nn.data=item;
        nn.next=null;
        //attach
        if(this.size>=1){
            this.tail.next=nn;
        }
        //summary object
        if(this.size==0){
            this.head=nn;
            this.tail=nn;
            this.size++;
        }
        else{
            this.tail=nn;
            this.size++;
        }

    }
}


