import java.util.regex.Pattern;

public class UserFactory {
    private final static Pattern facultyNumberPattern = Pattern.compile("\\d{9}");
    private final static Pattern egnPattern = Pattern.compile("\\d{10}");
    private final static Pattern emailPattern = Pattern.compile("[a-z]+@tu-sofia.bg");

    public static User createUser(String username, String password, UserType userType) throws CredentialsException {
        switch (userType) {
            case ADMIN:
                return new Admin(username, password);
            case STUDENT:
                if (!facultyNumberPattern.matcher(username).matches()) {
                    throw new CredentialsException("Error: Invalid faculty number format.");
                } else if (!egnPattern.matcher(password).matches()) {
                    throw new CredentialsException("Error: Invalid EGN format.");
                }
                return new Student(username, password);
            case TEACHER:
                if (!emailPattern.matcher(username).matches()) {
                    throw new CredentialsException("Error: Invalid email format.");
                } else if (password.length() < 5) {
                    throw new CredentialsException("Error: Password must be at least 5 characters");
                }
                return new Teacher(username, password);
            default:
                return null;
        }
    }
}
