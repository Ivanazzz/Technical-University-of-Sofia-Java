public class Main {
    public static void main(String[] args) {

       String mail = "test_123@abv.bg";

       MailValidator validator = new MailValidator();
       validator.EmailValidator();

       if (validator.validateMail(mail)) {
           System.out.println("Correct email");
       }
       else {
           System.out.println("Incorrect email");
       }
    }
}