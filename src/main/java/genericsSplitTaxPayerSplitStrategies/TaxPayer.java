package genericsSplitTaxPayerSplitStrategies;

/**
 * Created by root on 3/24/17.
 */
public abstract class TaxPayer<P extends TaxPayer<P>> {
    public static final TaxStrategy<Employee> EMPLOYEE =
            new EmployeeTaxStrategy();
    public static final TaxStrategy<Company> COMPANY =
            new CompanyTaxStrategy();
    public static final TaxStrategy<Trust> TRUST =
            new TrustTaxStrategy();

    private double income;
    private TaxStrategy<P> strategy;

    public TaxPayer(TaxStrategy<P> strategy, double income) {
        this.strategy = strategy;
        this.income = income;
    }

    protected abstract P getDetailedType();

    public double getIncome() {
        return income;
    }

    public double extortCash() {
        return strategy.extortCash(getDetailedType());
    }
}
