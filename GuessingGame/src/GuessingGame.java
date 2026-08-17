import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numberGuess = random.nextInt(10) + 1;
        int userGuess = 0;
        int guessCount = 0;

        System.out.print("Guess a number between 1 and 10:");

        while (userGuess != numberGuess) {
            userGuess = scanner.nextInt();
            guessCount++;

            if (userGuess < numberGuess) {
                System.out.println("Higher number. Try again.");
            } else if (userGuess > numberGuess) {
                System.out.println("Lower number. Try again.");
            } else {
                System.out.println("You found the number!");
                System.out.println("It took you " + guessCount + " guesses.");
            }
        }
        scanner.close();
    }
}