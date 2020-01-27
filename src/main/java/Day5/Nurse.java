package Day5;

public class Nurse {
    String name;
    String surname;
    int age;
    int salary;
    String title;
    int overtime;

    public Nurse() {
    }

    public Nurse(String name, String surname, int age, int salary, String title, int overtime) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.title = title;
        this.overtime = overtime;
}
    public void introduceN (){
        System.out.println("Hi, my name is " + name + " " + surname + ". " + "I am " + age + ". I earn " + salary + ". I work as " + title + ". In this month I do " + overtime + " overtimes.");
    }

}
