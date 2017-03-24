package splitTaxPayerSplitStrategies;

/**
 * Created by root on 3/24/17.
 */
public class TrustTaxStrategy implements TaxStrategy {
    private static final double PROFIT_RATE = 0.40;
    private static final double NON_PROFIT_RATE = 0.45;

    public double extortCash(TaxPayer payer) {
        Trust trust = (Trust) payer;
        if(((Trust) payer).isNonProfit()) return payer.getIncome() * NON_PROFIT_RATE;

        return payer.getIncome() * PROFIT_RATE;
    }
}
