package Week3;

public class Ex44 {
    public static int least(int number1, int number2) {
        // Determine the least of the two numbers
        if (number1 < number2) {
            return number1;
        } else {
            return number2;
        }
    }

    public static void main(String[] args) {
        // Call the least method with two numbers and store the result in the 'answer' variable
        int answer = least(2, 7);
        // Print the result
        System.out.println("Least: " + answer);
    }
}
