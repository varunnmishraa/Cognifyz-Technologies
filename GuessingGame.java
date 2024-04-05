import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1; // Generates a random number between 1 and 100
        int attempts = 0;
        int guess;
        boolean gameWon = false;
        int maxAttempts = 10; // Maximum number of attempts allowed

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("Rules:");
        System.out.println("1. You have to guess a number between 1 and 100.");
        System.out.println("2. You have a maximum of " + maxAttempts + " attempts to guess the correct number.");
        System.out.println("3. After each guess, you'll get feedback if your guess is too low or too high.");
        System.out.println("4. If you guess the correct number within the allowed attempts, you win!");
        System.out.println("5. If you don't guess the correct number within the allowed attempts, you lose.");
        System.out.println("\nLet's begin!\n");

        while (!gameWon && attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                gameWon = true;
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
            }
        }

        if (!gameWon) {
            System.out.println("Sorry, you didn't guess the number within the allowed attempts.");
            System.out.println("The number was: " + randomNumber);
        }

        scanner.close();
    }
}