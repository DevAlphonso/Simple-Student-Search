
import java.util.Random;

public class Student {

    private final Random r = new Random();

    private final String name;
    private final int id;

    public Student(String name) {
        this.name = name;
        this.id = r.nextInt(1111, 9999);
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "name: " + name + "\nid: " + id;
    }
}
