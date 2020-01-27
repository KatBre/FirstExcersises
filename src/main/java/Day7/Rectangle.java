package Day7;

public class Rectangle implements Drawable{
    int a;

    int b;

    public Rectangle(int a, int b) {

        this.a = a;

        this.b = b;

    }

    public int getArea() {

        int p = a * b;

        return p;

    }

    public int getPerimetr() {

        int ob = 2 * (a + b);

        return ob;

    }

    public void draw() {
        for (int i = 0; i < a; i++) {
            drawLine();
        }

       /* for (int i = 0; i < a; i++){
            System.out.println();
            for (int j = 0; j < b; j++) {
                System.out.print("*");
            }
        }*/
    }
    private void drawLine(){
        for (int i = 0; i < b; i++){
            System.out.print("*");
        }
        System.out.println();
    }
}
