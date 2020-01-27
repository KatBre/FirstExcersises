package Day4;

public class Rectangle {
    int a;
    int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void tangle() {
        System.out.println("Bok a wynosi: " + a);
        System.out.println("Bok b wynosi: " + b);
    }


    public int getArea() {
        int i = Math.multiplyExact(a, b);
        return i;
    }

    public int getPerimeter() {
        int j = Math.multiplyExact(a, b);
        return j;
    }
}
