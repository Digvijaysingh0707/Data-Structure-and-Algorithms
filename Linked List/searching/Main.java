
package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.push(10);
        list.push(30);
        list.push(11);
        list.push(21);
        list.push(14);
        if (list.search(list.head, 21)) {
            System.out.print("Yes");
        }

    }
}











