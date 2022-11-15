package cab.ig;

public class CabInvoiceGenerator {

    private double time, distance;
    private static final double RS_PER_MIN = 1, RS_PER_KM = 10, RS_MIN_FARE = 5;

    public CabInvoiceGenerator(double time, double distance) {
        this.time = time;
        this.distance = distance;
    }

    public double calculateFare() {
        double totalFare = distance * RS_PER_KM + time * RS_PER_MIN;

        if (totalFare < RS_MIN_FARE)
            totalFare = RS_MIN_FARE;

        return totalFare;
    }

}
