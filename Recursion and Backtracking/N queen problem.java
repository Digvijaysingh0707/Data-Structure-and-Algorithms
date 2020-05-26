package Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class SolveNqueen {
    static boolean isSafe(int board[][], int i, int j, int n) {
        //You can check for col
        for (int row = 0; row < i; row++) {
            if (board[row][j] == 1)//queen  at that place
                return false;
        }
            //check for left diagonal
            int x = i;
            int y = j;

            while (x >= 0 && y >= 0) {
                if (board[x][y] == 1) {
                     return false;
                }
                x--;
                y--;
            }
                //Now check for right diagonal
                x = i;
                y = j;
                while (x >= 0 && y <= n) {
                    if (board[x][y] == 1) {
                        return false;
                    }
                    x--;
                    y++;

                }

            //the position is now safe and we have check col and diagonal
            return true;
        }

        static boolean solveNQueen ( int board[][], int i, int n){
            if (i == n) {
                //we have successfully placed all the queens in n rows(0--n-1)
                //Print the board
                for ( i=0;i<n;i++){
                    for (int j=0;j<n;j++){
                        if (board[i][j]==1){
                            System.out.print("Q ");
                        }
                        else{
                            System.out.print("_ ");
                        }
                    }
                    System.out.println();
                }
                System.out.println();
                return false;
            }
            //Recursive case
            //Try to place the queen in the current row and call on the remaining part which can be solved by recursion
            for(int j=0;j<n;j++) {
                //I have to check if i,jth position is afe to place the queen or not

                if (isSafe(board, i, j, n)){
                    //Place the queen i,jth position is right
                    board[i][j]=1;
                    boolean rakhPayrahe =   solveNQueen(board,i+1,n);
                    if (rakhPayrahe){
                        return true;
                    }
                    //Means i jth position is not right -- our assumption is wrong
                    board[i][j]=0;//Back track
                }
            }
            //You have tried to place in all position but could not place the queen
            return false;

        }
        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int board[][] = new int[n][10];
            for (int[] s:board){
                Arrays.fill(s,0);
            }
            solveNQueen(board,0,n);

        }
    }

