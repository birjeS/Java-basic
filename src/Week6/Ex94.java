package Week6;
import java.util.ArrayList;
public class Ex94 {
    public static void main(String[] args) {
        // Exercise 94.1
        Person pekka = new Person("Pekka Mikkola", "040-123123");

        System.out.println(pekka.getName());
        System.out.println(pekka.getNumber());

        System.out.println(pekka);
        pekka.changeNumber("050-333444");
        System.out.println(pekka);

        // Exercise 94.2
        Phonebook phonebook = new Phonebook();
        phonebook.add("Pekka Mikkola", "040-123123");
        phonebook.add("Edsger Dijkstra", "045-456123");
        phonebook.add("Donald Knuth", "050-222333");

        phonebook.printAll();

        // Exercise 94.3
        String number = phonebook.searchNumber("Pekka Mikkola");
        System.out.println(number);

        number = phonebook.searchNumber("Martti Tienari");
        System.out.println(number);
    }
}

class Person {
    private String name;
    private String number;

    public Person(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return this.name;
    }

    public String getNumber() {
        return this.number;
    }

    public void changeNumber(String newNumber) {
        this.number = newNumber;
    }

    @Override
    public String toString() {
        return this.name + "  number: " + this.number;
    }
}

class Phonebook {
    private ArrayList<Person> phonebook;

    public Phonebook() {
        this.phonebook = new ArrayList<>();
    }

    public void add(String name, String number) {
        Person person = new Person(name, number);
        this.phonebook.add(person);
    }

    public void printAll() {
        for (Person person : this.phonebook) {
            System.out.println(person);
        }
    }

    public String searchNumber(String name) {
        for (Person person : this.phonebook) {
            if (person.getName().equals(name)) {
                return person.getNumber();
            }
        }
        return "number not known";
    }
}