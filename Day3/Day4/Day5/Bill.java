package Day4.Day5;

import java.util.Scanner;

public class Bill {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        int k = sc.nextInt();

        int[] bill = new int[n];

        int total = 0;

        
        for (int i = 0; i < n; i++) {
            bill[i] = sc.nextInt();
            total = total + bill[i];
        }

       
        int charged = sc.nextInt();

        
        total = total - bill[k];

     
        int actualShare = total / 2;

        if (charged == actualShare) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(charged - actualShare);
        }

        sc.close();
    } 
}
   


