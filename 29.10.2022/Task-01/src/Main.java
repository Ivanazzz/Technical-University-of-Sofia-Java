public class Main {
    public static void main(String[] args) {

        CompanyST companyST = new CompanyST("Microsoft", "12.01.1996", "5422648463",
                "Bill Gates", 15000.55, 96000.60);

        System.out.format("The income of company with name %s is %.2f dollars",
                companyST.name, companyST.getIncome());
    }
}