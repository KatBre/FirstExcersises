package Day5;

public class Adres {
    String postCode;
    String city;
    String street;
    String number;

    public Adres() {
    }

    public Adres(String postCode, String city, String street, String number) {
        this.postCode = postCode;
        this.city = city;
        this.street = street;
        this.number = number;
    }

    public void fullAdress() {
        System.out.println("My adress is " + postCode + " " + city + ", ul. " + street + " " + number + ".");
    }

}
