package splitTaxPayerSplitStrategies;

/**
 * Created by root on 3/24/17.
 */
public class Company extends TaxPayer {
    private int numberOfEmployees;

    public Company(TaxStrategy strategy, double income, int numberOfEmployees) {
        super(strategy, income);
        this.numberOfEmployees = numberOfEmployees;
    }

    int getNumberOfEmployees() {
        return numberOfEmployees;
    }
}
