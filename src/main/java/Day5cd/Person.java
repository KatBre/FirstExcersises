package Day5cd;

import Day5.Adres;

import java.util.Scanner;

import static Day5cd.Sex.FEMALE;

public class Person {
    String name;
    String surname;
    protected Sex sex;
    int age;

    public Person() {
    }

    public void readData() {
        System.out.println("Podaj Twoje imię: ");
        Scanner scan = new Scanner(System.in);
        this.name = scan.nextLine();
        System.out.println("Podaj Twoje nazwisko: ");
        this.surname = scan.nextLine();
        System.out.println("Jakiej jesteś płci:");
        String s1 = scan.nextLine();
        if (s1.equals("F")) {
            System.out.println("FEMALE");
        } else {
            System.out.println("MAN");
        }
        System.out.println("Ile masz lat? ");
        this.age = scan.nextInt();
    }

    public void readData2() {
        System.out.println("Podaj Twoje imię: ");
        Scanner scan = new Scanner(System.in);
        this.name = scan.nextLine();
        System.out.println("Podaj Twoje nazwisko: ");
        this.surname = scan.nextLine();
        System.out.println("Jakiej jesteś płci? FEMALE czy MALE?");
        String s2 = scan.nextLine();
        if ("FEMALE".equals(s2) || "MALE".equals(s2)) {
            this.sex = Sex.valueOf(s2);
        }
        System.out.println("Ile masz lat? ");
        this.age = scan.nextInt();
    }

    public void readData3() {
        System.out.println("Podaj Twoje imię: ");
        Scanner scan = new Scanner(System.in);
        this.name = scan.nextLine();
        System.out.println("Podaj Twoje nazwisko: ");
        this.surname = scan.nextLine();
        System.out.println("Jakiej jesteś płci? F czy M?");
        String s3 = scan.nextLine();
        if ("F".equals(s3)) { //stringi porównywać należy w ten sposób!!! najpierw należy się odwołać do stringa, a następnie do wartości podawanej w skanerze, bo gdyby nic nie było podane w skanerze, to przynajmniej program się nie wywali
            this.sex = Sex.FEMALE;
            System.out.println("FEMALE");
        } else {
            this.sex = Sex.MALE;
            System.out.println("MAN");
        }
        System.out.println("Ile masz lat? ");
        this.age = scan.nextInt();
    }


}