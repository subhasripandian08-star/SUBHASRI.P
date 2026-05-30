import java.util.Scanner;

public class TwoDArray {
    
    
        public static void main(String[] args){
            Scanner in=new Scanner(System.in);
          int[][] arr = new int[3][3];

        System.out.println("Enter 9 elements:");

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        System.out.println("Diagonal elements are:");

        for(int i = 0; i < 3; i++) {
            System.out.print(arr[i][i] + " ");
        }    
        
    }
    
}
