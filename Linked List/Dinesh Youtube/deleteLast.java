

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
      
   
   
    public static Listnode deleteLast(Listnode head){
        if(head==null){
            return head;
        }
        Listnode last =head;
        Listnode previousToLast=null;
        while(last.next!=null){
            previousToLast=last;
            last=last.next;
}
        last.next=null;
        return last;
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
        Listnode last = LinkedList.deleteLast(head);
        System.out.println(last.data);


       

    }
}

