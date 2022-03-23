import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;


public class Student implements Comparable<Student>
{
    private String name;
    private double grade;

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public int compareTo(Student s) {
        return Double.compare(this.getGrade(),s.getGrade());
    }

    @Override
    public String toString() {
        return name + ": " + grade;
    }

    public static void gradeMap(TreeSet<Student> roundedGrade) {
        Map<Integer, TreeSet<Student>> gradeMap = new HashMap<>();

        for (int i = 10; i >= 0; --i) {
            TreeSet<Student> studentsSameGrade = new TreeSet<>();
            for (Student s : roundedGrade) {
                if (s.getGrade() <= i && s.getGrade() >= (i-0.5)) {
                    studentsSameGrade.add(s);
                }
            }
            gradeMap.put(i, studentsSameGrade);
            studentsSameGrade.clear();
        }
    }
}
