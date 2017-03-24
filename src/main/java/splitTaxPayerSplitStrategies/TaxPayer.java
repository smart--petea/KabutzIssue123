package splitTaxPayerSplitStrategies;

/**
 * Created by root on 3/24/17.
 */
public class TaxPayer {
    private final TaxStrategy strategy;
    private final double income;

    public TaxPayer(TaxStrategy strategy, double income) {
        this.strategy = strategy;
        this.income = income;
    }

    public double getIncome() {
        return income;
    }

    public double extortCash() {
        return strategy.extortCash(this);
    }
}
