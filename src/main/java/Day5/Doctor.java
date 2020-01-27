package Day5;

public class Doctor {
    String name;
    String surname;
    int age;
    int salary;
    String speciality;
    int bonus;

    public Doctor() {
    }

    public Doctor(String name, String surname, int age, int salary, String speciality, int bonus) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.speciality = speciality;
        this.bonus = bonus;
    }
    public void introduceD (){
        System.out.println("Hi, my name is " + name + " " + surname + ". " + "I am " + age + ". I earn " + salary + ". I work as " + speciality + ". In this month I get " + bonus + " salary bonus.");
    }



}
