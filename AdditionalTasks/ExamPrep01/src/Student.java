import java.util.ArrayList;
import java.util.List;

public class Student extends User {
    private List<Grade> grades;

    public Student(String facultyNumber, String egn) {
        super(facultyNumber, egn);
        grades = new ArrayList<>();
    }

    public List<Grade> getGrades() {
        return grades;
    }

    @Override
    public UserType getUserType() {
        return UserType.STUDENT;
    }

    @Override
    public String toString()
    {
        return "Student{" +
                "grades=" + grades +
                "} " + super.toString();
    }
}
