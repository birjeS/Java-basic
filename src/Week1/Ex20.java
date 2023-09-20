package Week1;
import java.util.Scanner;
public class Ex20 {
    public static void main(String[] args) {
   //Define valid usernames and passwords
        String validUsername1 = "alex";
        String validPassword1 = "mightyducks";
        String validUsername2 = "emily";
        String validPassword2 = "cat";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type your username: ");
        String enteredUsername = scanner.nextLine();

        System.out.println("Type your password: ");
        String enteredPassword = scanner.nextLine();

        if ((enteredUsername.equals(validUsername1) && enteredPassword.equals(validPassword1))
        || (enteredUsername.equals(validUsername2) && enteredPassword.equals(validPassword2))) {
            System.out.println("You are now logged into the system");
        } else {
            System.out.println("Your username or password was invalid");
        }
    }
}
