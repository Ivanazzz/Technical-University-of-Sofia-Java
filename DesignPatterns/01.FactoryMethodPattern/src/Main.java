import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class GenerateBill {
    public static void main(String[] args) throws IOException {

        GetPlanFactory planFactory = new GetPlanFactory();

        // Get an object of DomesticPlan and call its getPlan() method.
        //  But we want to calculate the bill for one plan at time not all.for this we IO concept.

        System.out.println("Enter the name of plan for which the bill will be generated: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String planName = br.readLine();

        System.out.print("Enter the number of units for bill will be calculated: ");
        int units = Integer.parseInt(br.readLine());

        Plan plan = planFactory.getPlan(planName);

        // Call getRate() method and calculateBill method of DomesticPlan.

        System.out.print("Bill amount for " + planName + " of " + units + " units is: ");
        plan.getRate();
        plan.calculateBill(units);

    }
}