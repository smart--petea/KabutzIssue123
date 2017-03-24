package fullTaxPayerSplitStrategies;

/**
 * Created by root on 3/24/17.
 */
public class TrustTaxStrategy implements TaxStrategy {
    private static final double RATE = 0.40;
    public double extortCash(double income) {
        return income * RATE;
    }
}
