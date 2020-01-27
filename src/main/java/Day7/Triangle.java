package Day7;



public class Triangle implements Drawable {

    int a;

    int b;

    int c;

    public Triangle(int a, int b, int c) {

        this.a = a;

        this.b = b;

        this.c = c;

    }

    public double getTriangleField() {

        // double p = (1/2) *(a + b + c);  - CZEMU TO NIE DZIAŁA?

        double p = ((float) 1 / (float) 2) * (a + b + c);

        double S = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        return S;

    }

    public int getTrianglePerimetr() {

        int Ob = a + b + c;

        return Ob;

    }

    public void draw() {
        for (int i = a; i >= 0 ; i--) {
            System.out.println();
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
        }
    }
}

