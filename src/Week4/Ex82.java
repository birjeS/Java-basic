package Week4;
import java.util.ArrayList;
import java.util.Random;


public class Ex82 {
    public static void main(String[] args) {
        LotteryNumbers lotteryNumbers = new LotteryNumbers();
        ArrayList<Integer> numbers = lotteryNumbers.numbers();

        System.out.println("Lottery numbers:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println("");
    }
}

class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private Random random;

    public LotteryNumbers() {
        this.numbers = new ArrayList<>();
        this.random = new Random();
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        while (this.numbers.size() < 7) {
            int newNumber = generateRandomNumber();
            if (!containsNumber(newNumber)) {
                this.numbers.add(newNumber);
            }
        }
    }

    public boolean containsNumber(int number) {
        return this.numbers.contains(number);
    }

    private int generateRandomNumber() {
        return random.nextInt(39) + 1;
    }
}
