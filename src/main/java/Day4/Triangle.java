package Day4;

public class Triangle {
    double a;
    double b;
    double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void triangle() {
        System.out.println("Bok a wynosi: " + a);
        System.out.println("Bok b wynosi: " + b);
        System.out.println("Bok c wynosi: " + c);
    }


    public double getArea() {
        double p = ((a + b + c) / 2);
        double t = (p * (p - a) * (p - b) * (p - c));
        double i = Math.cbrt(t);
        return i;
    }

    public double getPerimeter() {
        double j = (a + b + c);
        return j;
    }
}
