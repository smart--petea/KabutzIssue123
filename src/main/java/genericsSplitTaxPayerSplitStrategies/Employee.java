package genericsSplitTaxPayerSplitStrategies;

/**
 * Created by root on 3/24/17.
 */
public class Employee extends TaxPayer<Employee> {
    protected Employee getDetailedType() {
        return this;
    }

    public enum Gender { MALE, FEMALE }
    private final boolean married;
    private final Gender gender;

    public Employee(TaxStrategy<Employee> strategy, double income,
                    boolean married, Gender gender) {
        super(strategy, income);
        this.married = married;
        this.gender = gender;
    }

    public boolean isMarried() {
        return married;
    }

    public Gender getGender() {
        return gender;
    }
}
