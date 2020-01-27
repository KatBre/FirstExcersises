package Day7;


public class Lawyer extends EmployeeTax{
    double tax;

    public Lawyer (String name, String surname, int salary, Employment employment) {
        super(name, surname, salary, employment);
        employment = Employment.CONTRACTOR;
    }

    public double calculateTax() {
        tax = (getSalary() * 0.2);
        return tax;
    }
}
