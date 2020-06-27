Time complexity : O(n*log(log(n)))


import java.util.Arrays;
import java.util.Scanner;

public class PrimeSieve {
    static void primeSieve(int p[]){
        //first mark all odd number as prime
        for (int i=3;i<1000000;i+=2){
            p[i]=1;
        }
        //sieve
        for (long i=3;i<1000000;i+=2){
            //if the current number is not marked then it is prime
            if (p[(int)i]==1){
//mark all multiple of i as not prime
                for (long j=i*i;j<1000000;j+=i){
                    p[(int)j]=0;
                }
            }
        }
        //special case
        p[2]=1;// 2 is a prime
        p[1]=p[0]=0;//0 and 1 is not prime
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p[]= new int[10000005];
        Arrays.fill(p,0);
        int count=0;
        primeSieve(p);
        //lets print prime upto range n
        for (int i=0;i<=n;i++){
            if (p[i]==1){
                count++;
                System.out.print(i+" ");
            }

        }






    }
}
