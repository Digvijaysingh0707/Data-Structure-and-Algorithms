package com.company;
import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
	static void dec(int n){
		if(n==0){
			return ;
		}
		System.out.print(n+" ");
		 dec(n-1);

	}
	static void ins(int n) {
        if (n == 0) {
            return;
        }

        ins(n - 1);
        System.out.print(n + " ");
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int x = sc.nextInt();
		dec(x);
		System.out.println();
		ins(x);

	}
}

