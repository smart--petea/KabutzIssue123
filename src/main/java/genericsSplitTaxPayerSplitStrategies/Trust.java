package genericsSplitTaxPayerSplitStrategies;

/**
 * Created by root on 3/24/17.
 */
public class Trust extends TaxPayer<Trust> {
    private boolean nonProfit;

    public Trust(TaxStrategy<Trust> strategy, double income, boolean nonProfit) {
        super(strategy, income);
        this.nonProfit = nonProfit;
    }

    boolean isNonProfit() {
        return nonProfit;
    }

    protected Trust getDetailedType() {
        return this;
    }
}
