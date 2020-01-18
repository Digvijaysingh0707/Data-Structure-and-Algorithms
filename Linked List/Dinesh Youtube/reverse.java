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
  









