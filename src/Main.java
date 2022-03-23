import java.util.HashMap;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>();
        students.add(new Student("Alex", 8.5));
        students.add(new Student("George", 6.6));
        students.add(new Student("Mario", 10));
        students.add(new Student("Andrei", 7.2));
        students.add(new Student("Cristina", 8.8));
        students.add(new Student("Mircea", 9.3));
        students.add(new Student("Andreea", 5.1));
        students.add(new Student("Lucian", 3));

        System.out.println("Students list: ");
        System.out.println(students);

        Student.gradeMap(students);
        System.out.println(students);
    }
}
