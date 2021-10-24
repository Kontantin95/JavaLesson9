import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Student {
    public String name;
    public int grade;

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(new Student("A", 100), new Student("B", 100), new Student("C", 93));

        students.sort(
                Comparator.comparing(Student::getGrade, Comparator.reverseOrder())
                        .thenComparing(student -> student.name)
        );

        students.forEach(System.out::println);
    }
}
