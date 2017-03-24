package genericsSplitTaxPayerSplitStrategies;

/**
 * Created by root on 3/24/17.
 */
public interface TaxStrategy<P extends TaxPayer> {
    public double extortCash(P p);
}
