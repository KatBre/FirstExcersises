package Day7;

public class Programmer extends EmployeeTax{
    double tax;

    public Programmer(String name, String surname, int salary, Employment employment) {
        super(name, surname, salary, employment);
        employment = Employment.B2B;
    }

    public double calculateTax() {
        tax = (getSalary() * 0.1);
        return tax;
    }
}
