package com.company;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    static boolean can_placeCows(int stalls[],int n,int c,int minSep){// c is the numbetr of cow to be placed
        int last_cow=stalls[0];
        //place the first cow in the first stall
        int count=1;
        for (int i=1;i<n;i++){
            if (stalls[i]-last_cow>=minSep){
                last_cow=stalls[i];
                count++;
                if (count==c){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfStalls=sc.nextInt();
        int c=sc.nextInt();

        int stalls[]=new int[noOfStalls];
        for (int i=0;i<noOfStalls;i++){
            stalls[i]=sc.nextInt();
        }
        Arrays.sort(stalls);
        //binary Search algo we atre not applying binary search on the stalls array we are applying it on the range rom s to e
        int s=0;
        int e=stalls[noOfStalls-1]-stalls[0];
        int ans=0;
        while (s<=e){
            int mid=(s+e)/2;
            boolean cowRakhPaye=can_placeCows(stalls,noOfStalls,c,mid);
            if (cowRakhPaye){
                ans=mid;
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        System.out.print(ans);


    }

    }







