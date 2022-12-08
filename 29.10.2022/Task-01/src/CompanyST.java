public class CompanyST extends Company{
    String tradersName;
    double initialCapital;
    double currentCapital;

    public CompanyST(String name, String establishmentDate, String bulstat,
                     String tradersName, double initialCapital, double currentCapital) {
        super(name, establishmentDate, bulstat);
        this.tradersName = tradersName;
        this.initialCapital = initialCapital;
        this.currentCapital = currentCapital;
    }

    public String getTradersName() {
        return tradersName;
    }

    public void setTradersName() {
        this.tradersName = tradersName;
    }

    public double getInitialCapital() {
        return initialCapital;
    }

    public void setInitialCapital() {
        this.initialCapital = initialCapital;
    }

    public double getCurrentCapital() {
        return currentCapital;
    }

    public void setCurrentCapital() {
        this.currentCapital = currentCapital;
    }

    public double getIncome() {
        return currentCapital - initialCapital;
    }
}
