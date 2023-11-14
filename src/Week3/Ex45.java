package Week3;

public class Ex45 {
    public static int greatest(int number1, int number2, int number3) {
        // Determine the greatest of the three numbers
        int greatestNumber = Math.max(Math.max(number1, number2), number3);
        return greatestNumber;
    }

    public static void main(String[] args) {
        // Call the greatest method with three numbers and store the result in the 'answer' variable
        int answer = greatest(2, 7, 3);
        // Print the result
        System.out.println("Greatest: " + answer);
    }
}
