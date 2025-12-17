
import java.util.ArrayList;

public class StudentManager {

    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
    }

    public ArrayList<Student> getAllStudents() {
        return students;
    }

    public Student searchStudent(String id) {
        for (Student s : students) {
            if (s.getStudentId().equalsIgnoreCase(id)) {
                return s;
            }
        }
        return null;
    }
}
