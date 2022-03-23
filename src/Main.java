import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        System.out.println(Math.round(9.49));
        System.out.println(Math.round(9.5));


        TreeSet<Student> students = new TreeSet<>();
        students.add(new Student("Lucian", 9.45));


        System.out.println("Students list: ");
        System.out.println(students);

        Student.gradeMap(students);
        System.out.println(students);
    }
}
