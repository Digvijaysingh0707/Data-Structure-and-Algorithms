We given a array ,we have to find number of subarray which are diviible by N, where N is the no of elements in array

we do this problem using Pegion hole principle in which we are given N holes and N+1 pegion so we have to put put 2 pegions in atlesast
1 hole

let array be 1,3,2,6,4 Or we can say we have to find (b-a)%N or b % N=a % N, where b=sum till index3(element 6) a=index 0(elemt 0 null elemnt)
which is 6-1=5
& array with sum(cumuative sum Array) ={0,1,4,6,12,16} 0 element represnt the null element
After dividing {0,1,4,6,12,16}%N(5) we get
A1={0,1,4,1,2,1}

{1,3,1,!,1} frequency array from A1, frequency of null element will initilly be 1,! represent no element 
ans will be fC2 , where f>=2
here ans =3c2 =3 as there are 3 one's


package com.company;
import java.security.KeyPair;
import java.util.*;

public class Main {



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            int n = sc.nextInt();
            long a[] = new long[n];
            int pre[] = new int[n]; // it is frequency array , we are not builing cumulative sum array

            while (t != 0) {
                t--;
                Arrays.fill(pre,0,n,0);
                pre[0] = 0;
                //read the input
                int sum = 0;
                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextInt();
                    sum += a[i];
                    sum %= n;
                    sum = (sum + n) % n;// cumulative sum array will not contain any negative element
                    pre[sum]++;
                }

            long ans = 0;
            for (int i = 0; i < n; i++) {
                long m = pre[i];
                ans += (m) * (m - 1) / 2;//mC2
            }
            System.out.print(ans);
        }

        }
    }











