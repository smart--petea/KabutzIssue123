package splitTaxPayerSplitStrategies;

/**
 * Created by root on 3/24/17.
 */
public class Trust extends TaxPayer {
    private boolean nonProfit;

    public Trust(TaxStrategy strategy, double income, boolean nonProfit) {
        super(strategy, income);
        this.nonProfit = nonProfit;
    }

    boolean isNonProfit() {
        return nonProfit;
    }
}
