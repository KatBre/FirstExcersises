package Day4;

import Day5.Adres;

public class Person {
    String name;
    String fullName;
    int age;
    Adres adres;

    public Person() {
    }

    public Person(String fullName1, int age1, Adres adres) {
        this.fullName = fullName1;
        this.age = age1;
        this.adres = adres;
    }

    public Person(String name, String fullName, int age, Adres adres) {
        this.name = name;
        this.fullName = fullName;
        this.age = age;
        this.adres = adres;
    }

    public void introduce() {
        System.out.println("My name is " + name + " " + fullName + ". " + "I am " + age + " years old.");
        adres.fullAdress();
    }
}