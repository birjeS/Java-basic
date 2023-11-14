package Week4;
import java.util.Scanner;

public class Ex79 {
    public static void main(String[] args) {
        NumberStatistics stats = new NumberStatistics();
        NumberStatistics evenStats = new NumberStatistics();
        NumberStatistics oddStats = new NumberStatistics();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type numbers:");
        while (true) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number == -1) {
                break;
            }

            stats.addNumber(number);

            if (number % 2 == 0) {
                evenStats.addNumber(number);
            } else {
                oddStats.addNumber(number);
            }
        }

        System.out.println("sum: " + stats.sum());
        System.out.println("sum of even: " + evenStats.sum());
        System.out.println("sum of odd: " + oddStats.sum());
    }
}

class NumberStatistics {
    private int amountOfNumbers;
    private int sum;

    public NumberStatistics() {
        this.amountOfNumbers = 0;
        this.sum = 0;
    }

    public void addNumber(int number) {
        this.amountOfNumbers++;
        this.sum += number;
    }

    public int amountOfNumbers() {
        return this.amountOfNumbers;
    }

    public int sum() {
        return this.sum;
    }

    public double average() {
        if (this.amountOfNumbers == 0) {
            return 0;
        }
        return (double) this.sum / this.amountOfNumbers;
    }
}