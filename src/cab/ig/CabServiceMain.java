package cab.ig;

import java.util.ArrayList;

public class CabServiceMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Cab Service!");

        CabInvoiceGenerator invoiceGenerator = new CabInvoiceGenerator(15, 20);
        System.out.println("Total fare of journey = " + invoiceGenerator.calculateFare() + " Rs.");

        ArrayList<CabInvoiceGenerator> cabs = new ArrayList<>();
        cabs.add(new CabInvoiceGenerator(10, 5));
        cabs.add(new CabInvoiceGenerator(8, 7));
        cabs.add(new CabInvoiceGenerator(4, 2));

        MultipleRides mulRides = new MultipleRides(cabs);
        System.out.println("Aggregate total for 3 rides = " + mulRides.calculateAggregateTotal());
    }
}
