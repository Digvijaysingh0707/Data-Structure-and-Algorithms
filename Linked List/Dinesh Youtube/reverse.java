import java.util.List;

public class LinkedList {
    //private Listnode head;//Head node to hold the list
    private static void display(Listnode head){
        if(head==null){
            return;
        }
        Listnode current =  head;

        while(current!=null){
            System.out.print(current.data+"--> ");
            current=current.next;
        }
        System.out.print(current);//this will print null at the end

    }

    private static class Listnode{
        private int data;
        private Listnode next;
        //constructor
        private Listnode(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Listnode reverse(Listnode head){
        if(head==null){
            return head;
        }
        Listnode current = head;
        Listnode previous=null;
        Listnode next = null;
        while(current!=null){
            next=current.next;
            current.next=previous;
            previous=current;
            current=next;
        }
        return previous;
    }

    public static void main(String[] args){
        Listnode head =new Listnode(10);
        Listnode second =new Listnode(1);
        Listnode third =new Listnode(15);
        Listnode fourth =new Listnode(4);
        head.next= second;
        second.next=third;
        third.next=fourth;


        LinkedList node= new LinkedList();
        node.display(head);

        Listnode l = node.reverse(head);
        node.display(l);



      

    }
}

// using recursion
import java.util.List;

public class LinkedList {
    private Listnode head;//Head node to hold the list


    private static class Listnode {
        private int data;
        private Listnode next;

        //constructor
        private Listnode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insertAtBegining(int data) {
        Listnode newNode = new Listnode(data);

        newNode.next = head;
        head = newNode;

    }

    public void display() {
        if (head == null) {
            return;
        }
        Listnode current = head;

        while (current != null) {
            System.out.print(current.data + "--> ");
            current = current.next;
        }
        System.out.print(current);//this will print null at the end

    }


    public static Listnode merge(Listnode a,Listnode b) {
        if(a==null){
            return b;
        }
        if(b==null){
            return a;
        }
        Listnode c;
        if(a.data<b.data){
            c=a;
            c.next=merge(a.next,b);
        }
        else{
            c=b;
            c.next=merge(a,b.next);
        }
        return c;
    }




    public static void main(String[] args){


        LinkedList node1= new LinkedList();
        LinkedList node2 = new LinkedList();
        Listnode head1= new Listnode(1);
        node1.insertAtBegining(31);
        node1.insertAtBegining(20);
        node1.insertAtBegining(7);
        node1.insertAtBegining(3);
        node1.insertAtBegining(2);
        node1.insertAtBegining(1);
       node1.display();
        System.out.println();
        Listnode head2= new Listnode(3);
        node2.insertAtBegining(31);
        node2.insertAtBegining(20);
        node2.insertAtBegining(7);
        node2.insertAtBegining(6);
        node2.insertAtBegining(4);
        node2.insertAtBegining(3);

        node2.display();
        Listnode node3 = new Listnode();
        node3=merge(head1,head2);













       // head =ll.insertAt(head,111,3);
        //ll.display(head);
       // System.out.print("Length of Linked List is:- "+ll.length(head));


    }
}
   /* public static int length(Listnode head){
        if(head==null){
            return 0;
        }
        int count =0;
        Listnode current = head;
        while(current!=null){
            count++;
            current=current.next;
        }
        return count;
    }*/













  









