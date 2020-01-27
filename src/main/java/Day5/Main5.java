package Day5;

import Day4.Person;

public class Main5 {

    public static void main(String[] args) {
        /*Adres adres1 = new Adres("81 - 519", "Gdynia", "Powstania", "9");
        Person human = new Person("Halina", "Wiaterek", 67, adres1);
        human.introduce();*/
        Nurse nurse1 = new Nurse("Grażyna", "Żuk", 39, 4500, "ward nurse", 120);
        Doctor doctor1 = new Doctor("Stefan", "Kolanko", 55, 15000, "anestezjolog", 6000);
        Porter porter1 = new Porter("Jan", "Nowak", 60, 1700, Shift.NIGHT_SHIFT);
        nurse1.introduceN();
        doctor1.introduceD();

    }

}