import java.io.Serializable;
import java.util.Objects;

public class Grade implements Serializable {
    private String subject;
    private int semester;
    private int grade;

    public Grade(String subject, int semester, int grade) {
        this.subject = subject;
        this.semester = semester;
        this.grade = grade;
    }

    public String getSubject() {
        return this.subject;
    }

    public int getSemester() {
        return this.semester;
    }

    public int getGrade() {
        return this.grade;
    }

    @Override
    public String toString()
    {
        return "Grade{" +
                "subject='" + subject + '\'' +
                ", semester=" + semester +
                ", grade=" + grade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        else if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Grade grade1 = (Grade) o;
        return semester == grade1.semester
                && grade == grade1.grade
                && Objects.equals(subject, grade1.subject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subject, semester, grade);
    }
}
