package Day6;

public class Nurse extends HospitalEmployee{
    private String title;
    private int overtime;

    public Nurse() {
    }

    public Nurse(String title, int overtime) {
        this.title = title;
        this.overtime = overtime;
}
    public void introduceN (){
        System.out.println("Hi, my name is " + name + " " + surname + ". " + "I am " + age + ". I earn " + salary + ". I work as " + title + ". In this month I do " + overtime + " overtimes.");
    }

}