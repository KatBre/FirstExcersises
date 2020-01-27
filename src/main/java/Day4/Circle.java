package Day4;

import static java.lang.Math.PI;

public class Circle {
    double r;

    public Circle(double r) {
        this.r = r;
    }

    public void circle() {
        System.out.println("Promień koła wynosi: " + r);
    }

    public double getArea() {
        double wynik = (r * r * PI);
        return wynik;
    }

    public double getPerimeter(){
        double wynik2 = (2 * r * PI);
        return wynik2;
    }
}
