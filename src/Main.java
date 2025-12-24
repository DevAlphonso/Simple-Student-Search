
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var running = true;
        String name;
        int choice;

        createStudents(sc);

        while (running) {
            System.out.println("Choose:");
            Action.displayMenu();
            System.out.print("input: ");

            while (!sc.hasNextInt()) {
                System.out.print("Please enter a number!\ninput: ");
                sc.next();
            }
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter the student's name: ");
                    name = sc.nextLine();
                    if (StudentManager.displayStudent(name) == null) {
                        System.out.println("Student not found.");
                    } else {
                        System.out.println(StudentManager.displayStudent(name));
                    }
                    break;
                case 2:
                    StudentManager.displayAllStudents();
                    break;

                case 3:
                    createStudents(sc);
                    break;

                case 4:
                    System.out.println("Program Stopped.");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }
        }
        sc.close();
    }

    public static void createStudents(Scanner sc) {
        String name;

        while (true) {
            System.out.print("Enter a name: ");
            name = sc.nextLine();
            if (name.equalsIgnoreCase("q")) {
                break;
            }
            var s = StudentManager.createStudent(name);

            if (s == null) {
                System.out.println("Please enter letters only!");
            }
        }
    }
}
