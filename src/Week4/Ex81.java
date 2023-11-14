package Week4;
import java.util.Random;

public class Ex81 {
    public static void main(String[] args) {
        PasswordRandomizer randomizer = new PasswordRandomizer(13);
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());
    }
}

class PasswordRandomizer {
    private int length;
    private Random random;

    public PasswordRandomizer(int length) {
        this.length = length;
        this.random = new Random();
    }

    public String createPassword() {
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            char randomChar = getRandomLowerCaseLetter();
            password.append(randomChar);
        }

        return password.toString();
    }

    private char getRandomLowerCaseLetter() {
        int number = random.nextInt(26);
        return "abcdefghijklmnopqrstuvwxyz".charAt(number);
    }
}
