import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Median {
    public static void main(String[] args) {
        //Max Heap
        PriorityQueue<Integer> leftHeap= new PriorityQueue<>(Collections.reverseOrder());
        //Min heap
        PriorityQueue<Integer> rightHeap = new PriorityQueue<>();
        Scanner sc = new Scanner(System.in);
        int d=sc.nextInt();
        double median=d;
        leftHeap.add(d);


        System.out.println("Median "+median);
        d=sc.nextInt();
        //input all element
        while (d!=-1){
            //logic
            if (leftHeap.size()>rightHeap.size()){
                if (d<median){
                    rightHeap.add(leftHeap.remove());
                    leftHeap.add(d);

                }
                else{
                    rightHeap.add(d);
                }
                median=(double)(leftHeap.peek()+rightHeap.peek())/2;
            }
            else if (leftHeap.size()==rightHeap.size()){
                if (d<median){
                    leftHeap.add(d);
                    median=(double)leftHeap.peek();
                }
                else{
                    rightHeap.add(d);
                    median=(double)rightHeap.peek();
                }
            }
            else if (leftHeap.size()<rightHeap.size()){
                if (d>median){
                    leftHeap.add(rightHeap.remove());
                    rightHeap.add(d);
                }
                else{
                    leftHeap.add(d);
                }
                median=(double)(leftHeap.peek()+rightHeap.peek())/2;

            }
            System.out.println("Median "+median+" ");
            d=sc.nextInt();
        }
    }
}
