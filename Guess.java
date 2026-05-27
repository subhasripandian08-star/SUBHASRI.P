import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int secret = 33;
        int guess;

        do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            if (guess < secret) {
                System.out.println("guess is smaller");
            }

            else if (guess > secret) {
                System.out.println("guess is higher");
            }

        } while (guess != secret);

        System.out.println("guess is correct");

        sc.close();
    }
}