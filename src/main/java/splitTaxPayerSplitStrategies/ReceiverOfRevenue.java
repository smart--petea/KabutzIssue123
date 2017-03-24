package splitTaxPayerSplitStrategies;

/**
 * Created by root on 3/24/17.
 */
public class ReceiverOfRevenue {
    public static void main(String[] args) {
        Employee heinz = new Employee(new EmployeeTaxStrategy(), 50000, true, Employee.Gender.FEMALE);
        Company company = new Company(new CompanyTaxStrategy(), 100000, 100);
        Trust trust = new Trust(new TrustTaxStrategy(), 30000, true);
        System.out.println(heinz.extortCash());
        System.out.println(company.extortCash());
        System.out.println(trust.extortCash());
    }
}
