import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;

public class Person implements Serializable {
    private String name;
    private LocalDate birth;
    private transient int age;

    public Person(String name, LocalDate birth)
    {
        this.name = name;
        this.birth = birth;
        setAge();
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public LocalDate getBirth()
    {
        return birth;
    }

    public void setBirth(LocalDate birth)
    {
        this.birth = birth;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge()
    {
        age = Period.between(birth, LocalDate.now()).getYears();
    }
}