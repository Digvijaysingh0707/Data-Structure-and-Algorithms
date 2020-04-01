Time complexity : O(n*log(log(n)))


// from gfg
package com.company;
import java.security.KeyPair;
import java.util.*;

public class Main {
    static void sieveOfEratosthenes(int n) {
        // Create a boolean array "prime[0..n]" and initialize
        // all entries it as true. A value in prime[i] will
        // finally be false if i is Not a prime, else true.
        boolean prime[] = new boolean[n + 1];
        for (int i = 0; i < n; i++)
            prime[i] = true;
        for (int p = 2; p * p <= n; p++) {
            // If prime[p] is not changed, then it is a prime
            if (prime[p] == true) {
                // Update all multiples of p
                for (int i = p * p; i <= n; i += p)
                    prime[i] = false;
            }
        }

            for (int i = 2; i <= n; i++) {
                if (prime[i] == true)
                    System.out.print(i + " ");

            }
        }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print("Following are the prime numbers ");
        System.out.println("smaller than or equal to " + n);
       Main g=new Main();
             g.sieveOfEratosthenes(n);

    }
}
//Coding blocks

public class Main {
        static void primeSieve(int[] p){
            //mark all odd number,even numbers will not be prime
            for (int i=3;i<=100000;i+=2){
                p[i]=1;
            }
            for (long i=3;i<=100000;i+=2){
                if (p[(int)i]==1){
                    // mark all ultiples of i as not prime
                    for (long j=i*i;j<=1000000;j+=i){
                        p[(int)j]=0;
                    }
                }
            }
            p[2]=1;
            p[1]=0;
        }


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int p[]= new int[10000005];
            Arrays.fill(p,0);
            int count=0;
            primeSieve(p);
            for (int i=0;i<=n;i++){
                if (p[i]==1){
                    count++;
                    System.out.print(i+" ");
                }

            }

            System.out.println("Total = "+count);





        }
    }







