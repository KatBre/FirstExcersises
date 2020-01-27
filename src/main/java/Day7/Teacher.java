package Day7;

public class Teacher extends EmployeeTax{
    double tax;

    public Teacher(String name, String surname, int salary, Employment employment) {
        super(name, surname, salary, employment);
        employment = Employment.PERMANENT;
    }

    public double calculateTax() {
        tax = (getSalary() * 0.4);
        return tax;
    }
}

