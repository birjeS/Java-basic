package Week1;
import java.util.Scanner;
public class Ex22 {
    public static void main(String[] args) {
        // Define the correct password
        String password = "carrot";

        // Create a Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Use a while loop to repeatedly ask for the password
        while (true) {
            System.out.println("Type the password: ");
            String enteredPassword = scanner.nextLine();

        // Check if the entered password matches the correct password
        if (enteredPassword.equals(password)){
            System.out.println("Right!");
            System.out.println("The secret is: jryy qbar!");
            break; //Exit the loop if the password is correct
        } else {
            System.out.println("Wrong!");
        }
        }
    }
}
