package Day7;

public abstract class EmployeeTax {
        String name;
        String surname;
        int salary;
        Employment employment;

    public EmployeeTax(String name, String surname, int salary, Employment employment) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.employment = employment;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employment getEmployment() {
        return employment;
    }

    public void setEmployment(Employment employment) {
        this.employment = employment;
    }

    public abstract double calculateTax();
}


