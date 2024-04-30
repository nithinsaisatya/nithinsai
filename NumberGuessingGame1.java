import java.util.Scanner;
import java.util.Random;
public class NumberGuessingGame1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int lowerBound = 1;
        int upperBound = 100;
        int targetNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        int maxAttempts = 10;
        int attempts = 0;
        boolean hasGuessedCorrectly = false;
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have chosen a number between " + lowerBound + " and " + upperBound + ". Try to guess it!");
        while (attempts < maxAttempts && !hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;
            if (userGuess == targetNumber) {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
            } else {
                String hint = (userGuess < targetNumber) ? "Try a higher number." : "Try a lower number.";
                System.out.println("Incorrect guess. " + hint);
            }
        }
        if (!hasGuessedCorrectly) {
            System.out.println("Sorry, you've run out of attempts. The correct number was: " + targetNumber);
        }
        scanner.close();
    }
}