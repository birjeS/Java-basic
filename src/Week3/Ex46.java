package Week3;

public class Ex46 {
    public static double average(int number1, int number2, int number3, int number4) {
        // Calculate the sum using the sum method
        int sum = sum(number1, number2, number3, number4);
        // Calculate the average
        double average = (double) sum / 4;
        return average;
    }

    public static int sum(int number1, int number2, int number3, int number4) {
        // Helper method to calculate the sum of numbers
        return number1 + number2 + number3 + number4;
    }

    public static void main(String[] args) {
        // Call the average method with four numbers and store the result in the 'answer' variable
        double answer = average(4, 3, 6, 1);
        // Print the result
        System.out.println("average: " + answer);
    }
}
