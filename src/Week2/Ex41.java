package Week2;
import java.util.Scanner;

public class Ex41 {
    public static void main(String[] args) {
        playNumberGuessingGame();
    }

    private static void playNumberGuessingGame() {
        int targetNumber = drawNumber();
        int numberOfGuesses = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Guess a number: ");
            int userGuess = scanner.nextInt();
            numberOfGuesses++;

            if (userGuess < targetNumber) {
                System.out.println("The number is greater, guesses made: " + numberOfGuesses);
            } else if (userGuess > targetNumber) {
                System.out.println("The number is lesser, guesses made: " + numberOfGuesses);
            } else {
                System.out.println("Congratulations, your guess is correct!");
                break;
            }
        }

        scanner.close();
    }

    private static int drawNumber() {
        // Simulating drawing a random number between 0 and 100
        return (int) (Math.random() * 101);
    }
}
