package Week7;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.start();
    }
}

class Reader {
    private Scanner scanner;

    public Reader() {
        this.scanner = new Scanner(System.in);
    }

    public String readString() {
        return scanner.nextLine();
    }

    public int readInteger() {
        return Integer.parseInt(scanner.nextLine());
    }
}

class Calculator {
    private Reader reader;

    public Calculator() {
        this.reader = new Reader();
    }

    public void start() {
        int calculations = 0;

        while (true) {
            System.out.print("command: ");
            String command = reader.readString();

            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
                calculations++;
            } else if (command.equals("difference")) {
                difference();
                calculations++;
            } else if (command.equals("product")) {
                product();
                calculations++;
            }
        }

        statistics(calculations);
    }

    private void sum() {
        int[] values = readValues();
        System.out.println("sum of the values " + (values[0] + values[1]));
    }

    private void difference() {
        int[] values = readValues();
        System.out.println("difference of the values " + (values[0] - values[1]));
    }

    private void product() {
        int[] values = readValues();
        System.out.println("product of the values " + (values[0] * values[1]));
    }

    private int[] readValues() {
        System.out.print("value1: ");
        int value1 = reader.readInteger();
        System.out.print("value2: ");
        int value2 = reader.readInteger();

        return new int[]{value1, value2};
    }

    private void statistics(int calculations) {
        System.out.println("Calculations done " + calculations);
    }
}
