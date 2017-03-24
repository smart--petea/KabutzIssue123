package genericsSplitTaxPayerSplitStrategies;

/**
 * Created by root on 3/24/17.
 */
public class Company extends TaxPayer<Company> {
    private int numberOfEmployees;

    public Company(TaxStrategy<Company> strategy, double income, int numberOfEmployees) {
        super(strategy, income);
        this.numberOfEmployees = numberOfEmployees;
    }

    int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    protected Company getDetailedType() {
        return this;
    }
}
