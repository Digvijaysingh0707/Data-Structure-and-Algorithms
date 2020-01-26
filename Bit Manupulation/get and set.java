N & 1 makes 1 at last

1<<2 =100
import java.util.List;
import java.util.Scanner;
import java.util.Stack;


public class LinkedList {
   static int OddOREven(int n){
        return (n&1);
    }
    static int getBit(int n ,int i){
       int mask=1<<i;
       int bit=(n & mask)>0?1:0;
       return bit;
    }
    static int setBit(int n,int i){
       int mask=1<<i;
       int ans=n | mask;
       return ans;
    }
    static int clearBit(int n ,int i){
       int mask=~(1<<i);
       int ans=n&mask;
       return ans;
    }







    public static void main(String[] args) {

        int n =10;
        if(OddOREven(n)==0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        
        System.out.println(getBit(7,3));
        System.out.println(setBit(5,1));
        System.out.println(clearBit(5,2));



    }
}












