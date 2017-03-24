package fullTaxPayerSplitStrategies;

/**
 * Created by root on 3/24/17.
 */
public class TaxPayer {
    public static final TaxStrategy EMPLOYEE =
            new EmployeeTaxStrategy();
    public static final TaxStrategy COMPANY =
            new CompanyTaxStrategy();
    public static final TaxStrategy TRUST =
            new TrustTaxStrategy();

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
        return strategy.extortCash(income);
    }
}
