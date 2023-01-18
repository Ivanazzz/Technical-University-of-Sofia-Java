
import java.util.HashMap;
import java.util.Map;

public class University {
    private String name;
    private Map<String, Student> students;

    public University(String name) {
        setName(name);

        students = new HashMap<>();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addStudent(Student student) throws Exception{
        if (students.containsKey(student.getFacultyNumber())) {
            throw new Exception("Already existing student!");
        }

        students.put(student.getFacultyNumber(), student);

        System.out.format("Successfully added student: %s - %s - %s - %d\n", student.getFacultyNumber(),
                student.getFirstName(), student.getLastName(), student.getAge());
    }

    public void removeStudent(String facultyNumber) throws Exception {
        if (!students.containsKey(facultyNumber)) {
            throw new Exception("Non-existеnt student!");
        }

        Student removedStudent = students.remove(facultyNumber);

        System.out.format("Successfully removed student: %s - %s - %s - %d\n", removedStudent.getFacultyNumber(),
                removedStudent.getFirstName(), removedStudent.getLastName(), removedStudent.getAge());
    }

    public Student getStudent(String facultyNumber) throws Exception {
        if (students.containsKey(facultyNumber)) {
            return students.get(facultyNumber);
        }

        throw new Exception("Non-existеnt student!");
    }

    public void getAllStudents() throws Exception {
        System.out.println("Students report:");

        for (Student student : students.values()) {
            System.out.format("%s - %s - %s - %d - %s\n", student.getFacultyNumber(), student.getFirstName(),
                    student.getLastName(), student.getAge(), student.getAverageGrade());
        }
    }

    public void getStudentsWithScholarship() throws Exception {
        System.out.println("Students with scholarship:");

        for (Student student : students.values()) {
            if (student.getHasScholarship()) {
                System.out.format("%s - %s - %s - %d - %s\n", student.getFacultyNumber(),
                        student.getFirstName(), student.getLastName(), student.getAge(), student.getAverageGrade());
            }
        }
    }
}
