package Week6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex103 {
    private final Scanner scanner;
    private final Map<String, Bird> birdDatabase;

    public Ex103(Scanner scanner) {
        this.scanner = scanner;
        this.birdDatabase = new HashMap<>();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ex103 birdWatcher = new Ex103(scanner);
        birdWatcher.start();
    }

    private void start() {
        while (true) {
            System.out.print("? ");
            String command = scanner.nextLine().trim();

            if (command.equals("Quit")) {
                break;
            }

            processCommand(command);
        }
    }

    private void processCommand(String command) {
        switch (command) {
            case "Add":
                addBird();
                break;
            case "Observation":
                observeBird();
                break;
            case "Statistics":
                printStatistics();
                break;
            case "Show":
                showBird();
                break;
            default:
                System.out.println("Unknown command");
        }
    }

    private void addBird() {
        System.out.print("Name: ");
        String name = scanner.nextLine().trim();
        System.out.print("Latin Name: ");
        String latinName = scanner.nextLine().trim();
        birdDatabase.put(name, new Bird(name, latinName));
    }

    private void observeBird() {
        System.out.print("What was observed:? ");
        String birdName = scanner.nextLine().trim();
        Bird bird = birdDatabase.get(birdName);

        if (bird != null) {
            bird.observe();
        } else {
            System.out.println("Is not a bird!");
        }
    }

    private void printStatistics() {
        for (Bird bird : birdDatabase.values()) {
            System.out.println(bird);
        }
    }

    private void showBird() {
        System.out.print("What? ");
        String birdName = scanner.nextLine().trim();
        Bird bird = birdDatabase.get(birdName);

        if (bird != null) {
            System.out.println(bird);
        } else {
            System.out.println("Is not a bird!");
        }
    }
}

class Bird {
    private final String name;
    private final String latinName;
    private int observations;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observations = 0;
    }

    public void observe() {
        observations++;
    }

    @Override
    public String toString() {
        return String.format("%s (%s): %d observations", name, latinName, observations);
    }
}
