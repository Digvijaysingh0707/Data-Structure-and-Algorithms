import java.util.List;
import java.util.Scanner;
import java.util.Stack;


class LinkedList{
   static int decimaltoBinary(int n){
        int ans=0;
        int p=1;
        while(n>0){
            int last_bit=(n&1);
            ans+=p*last_bit;
            p*=10;
            n=n>>1;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.print(decimaltoBinary(x));
        }

    }

