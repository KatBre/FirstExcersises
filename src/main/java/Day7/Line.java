package Day7;

public class Line implements Drawable {
    int a;

    public Line(int a) {
        this.a = a;
    }

    public void draw() {
        for (int i = 0; i < a; i++) {
            System.out.print("-");
        }
    }
}

