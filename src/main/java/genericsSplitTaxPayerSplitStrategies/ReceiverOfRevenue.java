package genericsSplitTaxPayerSplitStrategies;


/**
 * Created by root on 3/24/17.
 */
public class ReceiverOfRevenue {
    public static void main(String[] args) {
        Employee heinz = new Employee(TaxPayer.EMPLOYEE, 50000, true, Employee.Gender.FEMALE);
        Company company = new Company(TaxPayer.COMPANY, 100000, 100);
        Trust trust = new Trust(TaxPayer.TRUST, 30000, true);
        System.out.println(heinz.extortCash());
        System.out.println(company.extortCash());
        System.out.println(trust.extortCash());
    }
}
