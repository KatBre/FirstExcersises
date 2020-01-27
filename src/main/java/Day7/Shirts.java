package Day7;

public class Shirts extends Product {

    public Shirts(String name, int price, int quantity) {
        super(name, price, quantity);
    }

    public void getDescription() {
        System.out.println("W magazynie mamy " + name + " w cenie " + price + " zł, w ilości " + quantity + " szt.");
    }
}
