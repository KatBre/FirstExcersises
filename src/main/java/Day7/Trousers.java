package Day7;

public class Trousers extends Product {
    public Trousers(String name, int price, int quantity) {
        super(name, price, quantity);
    }

    public void getDescription() {
        System.out.println("W magazynie mamy " + name + " w cenie " + price + " zł, w ilości " + quantity + " szt.");
    }
}
