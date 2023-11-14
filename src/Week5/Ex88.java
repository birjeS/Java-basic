package Week5;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex88 {
    public static void main(String[] args) {
        // Exercise 88.1
        Student pekka = new Student("Pekka Mikkola", "013141590");
        System.out.println("name: " + pekka.getName());
        System.out.println("studentnumber: " + pekka.getStudentNumber());
        System.out.println(pekka);

        // Exercise 88.2
        ArrayList<Student> studentList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("name: ");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }

            System.out.print("studentnumber: ");
            String studentNumber = scanner.nextLine();

            Student student = new Student(name, studentNumber);
            studentList.add(student);
        }

        System.out.println();

        for (Student student : studentList) {
            System.out.println(student);
        }

        // Exercise 88.3
        System.out.print("\nGive search term: ");
        String searchTerm = scanner.nextLine();

        System.out.println("Result:");

        for (Student student : studentList) {
            if (student.getName().contains(searchTerm)) {
                System.out.println(student);
            }
        }
    }
}

class Student {
    private String name;
    private String studentNumber;

    public Student(String name, String studentNumber) {
        this.name = name;
        this.studentNumber = studentNumber;
    }

    public String getName() {
        return name;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    @Override
    public String toString() {
        return name + " (" + studentNumber + ")";
    }
}
