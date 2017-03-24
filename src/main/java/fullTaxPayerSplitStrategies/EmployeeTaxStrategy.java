package fullTaxPayerSplitStrategies;

/**
 * Created by root on 3/24/17.
 */

public class EmployeeTaxStrategy implements TaxStrategy {
    private static final double RATE = 0.45;
    public double extortCash(double income) {
        return income * RATE;
    }
}

