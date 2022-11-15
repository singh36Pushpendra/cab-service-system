package cab.ig;

public class CabServiceMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Cab Service!");

        CabInvoiceGenerator invoiceGenerator = new CabInvoiceGenerator(15, 20);
        System.out.println("Total fare of journey = " + invoiceGenerator.calculateFare() + " Rs.");
    }
}
