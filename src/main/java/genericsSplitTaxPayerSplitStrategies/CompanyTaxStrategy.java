package genericsSplitTaxPayerSplitStrategies;

/**
 * Created by root on 3/24/17.
 */
public class CompanyTaxStrategy implements TaxStrategy<Company> {
    private static final double LITTLE_RATE = 0.30;
    private static final double BIG_RATE = 0.40;

    public double extortCash(Company company) {

        if(company.getNumberOfEmployees() > 5) return company.getIncome() * BIG_RATE;
        return company.getIncome() * LITTLE_RATE;
    }
}
