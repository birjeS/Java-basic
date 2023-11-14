package Week3;

public class Ex43 {
    public static int sum(int number1, int number2, int number3, int number4) {
        // Calculate the sum of the numbers
        int sumResult = number1 + number2 + number3 + number4;
        // Return the calculated sum
        return sumResult;
    }

    public static void main(String[] args) {
        // Call the sum method with four numbers and store the result in the 'answer' variable
        int answer = sum(4, 3, 6, 1);
        // Print the result
        System.out.println("sum: " + answer);
    }
}




