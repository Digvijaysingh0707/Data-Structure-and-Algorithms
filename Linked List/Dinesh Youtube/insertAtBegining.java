

public class LinkedList {
    //private Listnode head;//Head node to hold the list
    private void display(Listnode head){
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
    public Listnode insertAtBegining(Listnode head,int data){
        Listnode newNode= new Listnode(data);
        if(head==null){
            return newNode;
        }
        newNode.next=head;
        head=newNode;
        return head;
    }
    public int length(Listnode head){
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
    }


    public static void main(String[] args){
        Listnode head =new Listnode(10);
        Listnode second =new Listnode(1);
        Listnode third =new Listnode(15);
        Listnode fourth =new Listnode(4);
        head.next= second;
        second.next=third;
        third.next=fourth;


        LinkedList ll= new LinkedList();
        ll.display(head);
        System.out.println();
        
        
        Listnode newHead= ll.insertAtBegining(head,15);
        ll.display(newHead);
       // System.out.print("Length of Linked List is:- "+ll.length(head));


    }
}

