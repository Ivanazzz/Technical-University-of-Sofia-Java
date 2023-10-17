import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        // Get Bank factory
        // Get an object of Bank and call its method getBank().
        // But we want to get one bank at time not all. For this we IO concept

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the name of Bank from where you want to take loan amount: ");

        String bankName = br.readLine();

        System.out.println("Enter the type of loan you want to take, like home loan or business loan or education loan: ");

        String loanName = br.readLine();

        AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");
        Bank b = bankFactory.getBank(bankName);

        System.out.println("Enter the interest rate for " + b.getBankName() + ": ");

        double rate = Double.parseDouble(br.readLine());

        System.out.println("Enter the loan amount you want to take: ");

        double loanAmount = Double.parseDouble(br.readLine());

        System.out.println("Enter the number of years to pay your entire loan amount: ");

        int years = Integer.parseInt(br.readLine());

        System.out.println("You are taking the loan from " + b.getBankName());

        AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");

        Loan l = loanFactory.getLoan(loanName);
        l.getInterestRate(rate);
        l.calculateLoanPayment(loanAmount, years);
    }
}