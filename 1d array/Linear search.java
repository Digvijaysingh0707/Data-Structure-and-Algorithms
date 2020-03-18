//Element can be randomly arranged
Time :O(n)
package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array: ");
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the value of key: ");
        int key = sc.nextInt();
        int i ;
        for( i =0;i<arr.length;i++){
            if(key==arr[i]){
                System.out.println("Element found at index "+i);
                break;
            }
        }
        if(i==n){
            System.out.println("Element is not present");
        }


    }

	}
