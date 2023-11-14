package Week6;

import java.util.Scanner;

public class Ex105 {

    private Scanner reader;

    public Ex105() {
        this.reader = new Scanner(System.in);
    }

    public void play(int lowerLimit, int upperLimit) {
        instructions(lowerLimit, upperLimit);

        while (lowerLimit != upperLimit) {
            int averageValue = average(lowerLimit, upperLimit);

            if (isGreaterThan(averageValue)) {
                lowerLimit = averageValue + 1;
            } else {
                upperLimit = averageValue;
            }
        }

        System.out.println("The number you're thinking of is " + lowerLimit + ".");
    }

    public boolean isGreaterThan(int value) {
        System.out.println("Is your number greater than " + value + "? (y/n)");
        String answer = reader.nextLine().trim().toLowerCase();
        return answer.equals("y");
    }

    public int average(int firstNumber, int secondNumber) {
        return (firstNumber + secondNumber) / 2;
    }

    public void instructions(int lowerLimit, int upperLimit) {
        int maxQuestions = howManyTimesHalvable(upperLimit - lowerLimit);

        System.out.println("Think of a number between " + lowerLimit + "..." + upperLimit + ".");
        System.out.println("I promise you that I can guess the number you are thinking of with " + maxQuestions + " questions.");
        System.out.println("");
        System.out.println("Next I'll present you with a series of questions. Answer them honestly.");
        System.out.println("");
    }

    public static int howManyTimesHalvable(int number) {
        return (int) (Math.log(number) / Math.log(2)) + 1;
    }

    public static void main(String[] args) {
        Ex105 game = new Ex105();
        game.play(1, 100); // Test with smaller lower- and upperLimit values
    }
}
