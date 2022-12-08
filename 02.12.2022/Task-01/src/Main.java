import java.io.*;
import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        Person person = new Person("Ivan", LocalDate.of(2002, 1, 10));

        final String filePath = "person.bin";

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filePath)))
        {
            out.writeObject(person);
        }
        catch (IOException e)
        {

        }

        Person personFromFile = null;

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filePath)))
        {
            personFromFile = (Person) in.readObject();
            personFromFile.setAge();
        }
        catch (IOException | ClassNotFoundException e)
        {

        }

        System.out.format("Person Name: %s is %d years old", personFromFile.getName(), personFromFile.getAge());
    }
}