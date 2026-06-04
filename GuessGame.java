import java.util.Scanner;
import java.util.Random;

public class GuessGame {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        char replay;
        System.out.println("Welcome to the Guess the Number Game!");
        do {
            int number = rand.nextInt(100) + 1;
            int guess = 0;
            int trials = 0;
            while (guess != number) {
                System.out.println("Enter your Guess Number: ");
                guess = sc.nextInt();
                trials++;
                if (guess > number) {
                    System.out.println("Too high! Try Smaller No. ");
                } else if (guess < number) {
                    System.out.println("Too low! Try Higher No. ");

                } else {
                    System.out.println("Amazing you guessed the no. in" + trials + " attempts ");
                }
            }
            System.out.println("Do you wanna play again? Y/N: ");
            replay = sc.next().charAt(0);

        } while (replay == 'Y' || replay == 'y');
        System.out.println("Thanks For Playing!");
        sc.close();

    }
}
