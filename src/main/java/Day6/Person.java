package Day6;

import Day5.Adres;

public class Person {
    private String name;
    private String fullName;
    private int age;
    private Adres adres;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }

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