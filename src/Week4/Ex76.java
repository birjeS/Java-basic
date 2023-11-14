package Week4;
import java.util.ArrayList;

public class Ex76 {
    private ArrayList<String> meals;

    public Ex76() {
        this.meals = new ArrayList<String>();
    }

    // Exercise 76.1: Adding a meal to menu
    // Add a new meal to the list this.meals of a Menu object.
    // If the meal is already in the list, it should not be added.
    public void addMeal(String meal) {
        if (!this.meals.contains(meal)) {
            this.meals.add(meal);
        }
    }

    // Exercise 76.2: Printing the menu
    // Print the meals in a menu.
    public void printMeals() {
        for (String meal : this.meals) {
            System.out.println(meal);
        }
    }

    // Exercise 76.3: Clearing a menu
    // Clear a menu. After calling this method, the menu should be empty.
    // Class ArrayList has a method that is useful here.
    public void clearMenu() {
        this.meals.clear();
    }

    public static void main(String[] args) {
        // Example of usage
        Ex76 menu = new Ex76();

        menu.addMeal("Hamburger");
        menu.addMeal("Fish'n'Chips");
        menu.addMeal("Sauerkraut");

        // Exercise 76.2: Printing the menu
        // Output should be:
        // Hamburger
        // Fish'n'Chips
        // Sauerkraut
        menu.printMeals();
        System.out.println();

        // Exercise 76.3: Clearing a menu
        // After calling this method, the menu should be empty.
        // Output should be an empty line.
        menu.clearMenu();
        menu.printMeals();
    }
}
