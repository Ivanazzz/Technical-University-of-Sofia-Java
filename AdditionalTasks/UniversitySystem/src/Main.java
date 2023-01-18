import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter university name:");
        String universityName = scanner.nextLine();
        University university = new University(universityName);

        System.out.println("\nEnter command:");
        String command = scanner.nextLine();

        while (!command.toLowerCase().equals("end")) {
            try {
                String[] commandTokens = command.split("[-]+");
                String commandType = commandTokens[0];

                if (commandType.equals("addStudent")) {
                    String facultyNumber = commandTokens[1];
                    String firstName = commandTokens[2];
                    String lastName = commandTokens[3];
                    int age = Integer.parseInt(commandTokens[4]);
                    String[] grades = Arrays.copyOfRange(commandTokens, 5, commandTokens.length);

                    Student student = new Student(facultyNumber, firstName, lastName, age);

                    for (String grade : grades) {
                        int gradeAsInt = Integer.parseInt(grade);
                        student.addGrade(gradeAsInt);
                    }

                    university.addStudent(student);
                }
                else if (commandType.equals("removeStudent")) {
                    String facultyNumber = commandTokens[1];
                    university.removeStudent(facultyNumber);
                }
                else if (commandType.equals("getStudentsWithScholarship")) {
                    university.getStudentsWithScholarship();
                }
                else if (commandType.equals("getAllStudents")) {
                    university.getAllStudents();
                }
                else if (commandType.equals("addStudentsGrade")) {
                    String facultyNumber = commandTokens[1];
                    int grade = Integer.parseInt(commandTokens[2]);
                    Student student = university.getStudent(facultyNumber);

                    student.addGrade(grade);
                }
                else {
                    throw new Exception("Invalid command type!");
                }
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
            finally {
                System.out.println("\nEnter command:");
                command = scanner.nextLine();
            }
        }
    }
}