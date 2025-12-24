
import java.util.HashMap;
import java.util.LinkedHashMap;

public class StudentManager {

    private static final LinkedHashMap<Integer, Student> students = new LinkedHashMap<>();

    public static Student createStudent(String name) {

        if (!name.matches("[a-zA-Z ]+")) {
            return null;
        }

        Student s = new Student(name);
        students.put(s.getId(), s);
        return s;
    }

    public static void addStudent(int id, Student s) {
        students.put(s.getId(), s);
    }

    public HashMap<Integer, Student> getStudents() {
        return students;
    }

    public static Student displayStudent(String name) {
        for (var s : students.values()) {

            if (s.getName().equalsIgnoreCase(name)) {
                return s;
            }
        }
        return null;
    }

    public static void getAllStudents() {
        for (Student s : students.values()) {
            System.out.println(s);
        }
    }

    public static void displayAllStudents() {
        var i = 0;
        for (Student s : students.values()) {
            i++;
            System.out.println("\nStudent " + i + ": \n\tName: " + s.getName() + "\n\tID: " + s.getId());
        }
    }
}
