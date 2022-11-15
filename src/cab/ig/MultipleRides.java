package cab.ig;

import java.util.ArrayList;

public class MultipleRides {

    private ArrayList<CabInvoiceGenerator> generators;

    public MultipleRides(ArrayList<CabInvoiceGenerator> generators) {
        this.generators = generators;
    }

    public double calculateAggregateTotal() {
        return generators.stream()
                .map(cabService -> cabService.calculateFare())
                .reduce(0.0, (aggregateFare, fare) -> aggregateFare + fare);
    }
}
