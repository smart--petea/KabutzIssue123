package genericsSplitTaxPayerSplitStrategies;

/**
 * Created by root on 3/24/17.
 */
public class TrustTaxStrategy implements TaxStrategy<Trust> {
    private static final double PROFIT_RATE = 0.40;
    private static final double NON_PROFIT_RATE = 0.45;

    public double extortCash(Trust trust) {
        if(trust.isNonProfit()) return trust.getIncome() * NON_PROFIT_RATE;

        return trust.getIncome() * PROFIT_RATE;
    }
}
