N & 1 makes 1 at last then it is odd 
if 0 then even

1<<2 =100
import java.util.List;
import java.util.Scanner;
import java.util.Stack;


public class LinkedList {
   static int OddOREven(int n){
        return (n&1);
    }
    static int getBit(int n ,int i){//used to find ith bit is set or not
       int mask=1<<i;
       int bit=(n & mask)>0?1:0;
       return bit;
    }
    static int setBit(int n,int i){//it sets the ith bit and make it 1
       int mask=1<<i;
       int ans=n | mask;
       return ans;
    }
    static int clearBit(int n ,int i){//it clears the ith bit and make it to zero
       int mask=~(1<<i);
       int ans=n&mask;
       return ans;
    }
   static int updateBit(int n ,int i,int v){
       int mask=~(1<<i);
       int cleared_n=n&mask;
      n=cleared_n|(v<<i);
       return n;
    }
   static int clearLastBits(int n,int i){
        int mask=(-1<<i);
        n=n&mask;
        return n;
    }
    static int clearRangeItoJ(int n,int i,int j){
        int ones=(~0);
        int a=ones<<(j+1);
        int b=(1<<i)-1;
        int mask=a|b;
        n=n&mask;
        return n;
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












