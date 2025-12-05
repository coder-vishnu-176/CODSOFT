import java.util.Scanner;
import java.util.Random;

public class guess {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int again = 1;
        int score = 0;

        System.out.println("---- Number Guessing Game ----");

        while (again == 1) {

            int num = r.nextInt(100) + 1;
            int tries = 0;
            int limit = 7;
            boolean win = false;

            System.out.println("I Picked a number between 1 and 100");
            System.out.println("You have " + limit + " tries.");

            while (tries < limit) {
                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();
                tries++;

                if (guess == num) {
                    System.out.println("You got it right!");
                    System.out.println("You guessed it in " + tries + " tries.");
                    win = true;
                    score = score + (limit - tries + 1);
                    break;
                } else if (guess > num) {
                    System.out.println("Too high");
                } else {
                    System.out.println("Too low");
                }
            }

            if (!win) {
                System.out.println("You used all tries. The number was: " + num);
            }

            System.out.print("Play again? (1 = yes, 0 = no): ");
            again = sc.nextInt();
        }

        System.out.println("Your final score: " + score);
        System.out.println("Thanks for playing!");
    }
}
