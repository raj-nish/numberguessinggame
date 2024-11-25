import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lowerBound = 1; 
        int upperBound = 100; 
        int maxAttempts = 7; 

        
        int randomNumber = (int) (Math.random() * (upperBound - lowerBound + 1)) + lowerBound;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between " + lowerBound + " and " + upperBound + ".");
        System.out.println("You have " + maxAttempts + " attempts to guess the correct number.");
        
        boolean guessedCorrectly = false;

        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            System.out.print("Attempt " + attempt + ": Enter your guess: ");
            int playerGuess = scanner.nextInt();

            if (playerGuess == randomNumber) {
                System.out.println("Congratulations! You've guessed the correct number: " + randomNumber);
                guessedCorrectly = true;
                break;
            } else if (playerGuess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }

        if (!guessedCorrectly) {
            System.out.println("Sorry, you've used all your attempts. The correct number was: " + randomNumber);
        }

        System.out.println("Thank you for playing!");
        scanner.close();
    }
}

