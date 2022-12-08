public class Company {
    String name;
    String establishmentDate;
    String bulstat;

    public Company(String name, String establishmentDate, String bulstat) {
        this.name = name;
        this.establishmentDate = establishmentDate;
        this.bulstat = bulstat;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public String getEstablishmentDate() {
        return establishmentDate;
    }

    public void setEstablishmentDate() {
        this.establishmentDate = establishmentDate;
    }

    public String getBulstat() {
        return bulstat;
    }

    public void setBulstat() {
        if (bulstat.length() == 10) {
            this.bulstat = bulstat;
        }
    }
}
