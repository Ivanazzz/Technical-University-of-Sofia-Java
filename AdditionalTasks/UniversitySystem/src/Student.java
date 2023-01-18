import java.util.ArrayList;
import java.util.List;

public class Student {
    private String facultyNumber;
    private String firstName;
    private String lastName;
    private int age;
    private boolean hasScholarship;
    private List<Integer> grades;

    public Student(String facultyNumber, String firstName, String lastName, int age) throws Exception{
        setFacultyNumber(facultyNumber);
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);

        grades = new ArrayList<Integer>();
    }

    public String getFacultyNumber() {
        return this.facultyNumber;
    }

    public void setFacultyNumber(String facultyNumber) throws Exception {
        if (facultyNumber.length() != 9) {
            throw new Exception("Invalid faculty number!");
        }

        this.facultyNumber = facultyNumber;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return this.age;
    }

    public boolean getHasScholarship() {
        return this.hasScholarship;
    }

    public void setAge(int age) throws Exception {
        if (age <= 18 || age >= 50) {
            throw new Exception("Age should be greater than 18 and less than 50!");
        }

        this.age = age;
    }

    public String getAverageGrade() throws Exception {
        int sum = 0;

        if (grades.size() == 0) {
            return "No grades!";
        }

        for (int grade : grades) {
            sum += grade;
        }

        double average = sum * 1.0 / grades.size();
        if (average >= 5.50) {
            hasScholarship = true;
        }

        return String.format("%.2f", average);
    }

    public void addGrade(int grade) throws Exception{
        if (grade < 2 || grade > 6) {
            throw new Exception("Invalid grade!");
        }

        grades.add(grade);
        getAverageGrade();
    }
}
