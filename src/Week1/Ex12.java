package Week1;
import java.util.Scanner;
public class Ex12 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a name ");
        String text = reader.nextLine();
        System.out.println(text);

        System.out.print("Type your age ");
        int age = Integer.parseInt(reader.nextLine());
        System.out.println(age);

        System.out.print("Type a name ");
        String textTwo = reader.nextLine();
        System.out.println(textTwo);

        System.out.print("Type your age ");
        int ageTwo = Integer.parseInt(reader.nextLine());
        System.out.println(ageTwo);

        int sum = age + ageTwo;
        System.out.println(text + " and " + textTwo + " are " + sum + " years old in total.");
    }
}
