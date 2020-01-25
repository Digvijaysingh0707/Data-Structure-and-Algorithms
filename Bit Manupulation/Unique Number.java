In  this we have to found the uique numebr which is not being repeted
1 2 2 3 3
output =1




import java.util.List;
import java.util.Scanner;
import java.util.Stack;


public class LinkedList {






    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num;
        int ans=0;
        for(int i =0;i<n;i++){
            num=sc.nextInt();
            ans=ans^num;
        }
        System.out.print(ans);



    }
}












