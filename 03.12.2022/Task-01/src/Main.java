
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        List<Customer> listOfCustomers  = new ArrayList();
        listOfCustomers.add(new Customer("Adam",18, 175));
        listOfCustomers.add(new Customer("Saly", 19, 162));
        listOfCustomers.add(new Customer("Bob", 15, 189));
        listOfCustomers.add(new Customer("Marry", 21, 203));

        Collections.sort(listOfCustomers,
                new CustomerSortingComparator());

        for(Customer cust : listOfCustomers){
            System.out.println(cust.name + " - " + cust.years + " - " + cust.height);
        }
    }

    static class Customer {
        private String name;
        private int years;
        private int height;

        Customer(String name, int years, int height){
            this.name = name;
            this.years = years;
            this.height = height;
        }

        public String getName() { return name; }

        public void setName(String years) { this.name = name; }

        public Integer getYears() { return years; }

        public void setYears(Integer years) { this.years = years; }

        public Integer getHeight() { return height; }

        public void setHeight(Integer height) { this.height = height; }
    }

    static class CustomerSortingComparator
            implements Comparator<Customer> {

        @Override
        public int compare(Customer customer1,
                           Customer customer2)
        {
            int firstCustHeight = customer1.height;
            int secondCustHeight = customer2.height;

            //for asc
            //return firstCustHeight - secondCustHeight;

            //for desc
            return secondCustHeight - firstCustHeight;
        }
    }
}