package Homework;

public class MainH1podstawy1 {

    public static void main(String[] args) {
        System.out.println(ex1(3, 5));
        System.out.println(ex1(3, 0));
        System.out.println(ex2(1, 2, 2, 8));
        System.out.println(ex2(2, 3, 6));
        System.out.println(ex3(45));
        ex4();
        System.out.println(ex5(3, 4));
        System.out.println(ex6(5));
        long v = 10 + ex1(3, 4);
        System.out.println(v);
        System.out.println(ex7(86399));
        ex8();
        ex9();
        System.out.println("ex10");
        ex10();

    }


    public static long ex1(int a, int b) {
        long wynik = 1;
        for (int i = 0; i < b; i++) {
            wynik = a * wynik;
        }
        return wynik;
    }

    public static int ex2(int... b) {
        int a = b[0] * b[1];
        for (int i = 2; i < b.length; i++) {
            a = a * b[i];
        }
        return a;
    }

    public static int ex3(int d) {
        int e = 0;
        while (d > 0) {
            int b = d % 10;
            e += b;
            d /= 10;
        }
        return e;
    }

    public static void ex4() {
        String s = "* * * * * * ======================================";
        String f = " * * * * *  ======================================";
        String e = "==================================================";
        System.out.println(s);
        System.out.println(f);
        System.out.println(s);
        System.out.println(f);
        System.out.println(s);
        System.out.println(f);
        System.out.println(s);
        System.out.println(f);
        System.out.println(s);
        for (int i = 0; i < 6; i++) {
            System.out.println(e);
        }

    }

    public static boolean ex5(int o, int p) {
        if (o >= p) {
            return true;
        }
        return false;
    }


    public static int ex6(int g) {
        int h = 1;
        for (int i = 1; i <= g; i++) {
            h = h * i;
        }
        return h;
    }

    public static String ex7(int t) {
        int a = t / 3600;
        int b = (t % 3600) / 60;
        int c = ((t % 3600) % 60) % 60;
        String wynikT = Integer.toString(a) + ":" + Integer.toString(b) + ":" + Integer.toString(c);
        return wynikT;
    }

    public static void ex8() {
        int[] numbers = {1, 45, 564, 7867, 34, 5456, 210};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 100) {
                System.out.println(numbers[i]);
            }
        }
    }

    public static void ex9() {
        int[] oddNumbers = {1, 45, 564, 7867, 34, 5456, 210};
        for (int i = 0; i < oddNumbers.length; i++) {
            if (oddNumbers[i] % 2 == 0) {
                System.out.println(oddNumbers[i]);
            }
        }
    }

    public static void ex10() {
        int[] liczby =  {1, 45, 564, 7867, 34, 5456, 210};
        for (int i = liczby.length; i <= 0; i++) {
            System.out.println(liczby[i]);
        }
    }


}

















/*{
        int[] tablica = {2, 3, 5, 45, 47, 234, 237, 6, 9, 13, 84} ;
        for (int i = 0; i < tablica.length; i++)
            if (tablica[i] % 2 == 0) {
                System.out.println(0);
            } else {
                    System.out.println(1);
                }
            }
    }
        public static long ex1(int a, int b) { //H: uwzględnić 0 i liczby ujemne b<0 to nie wykona, a jeśli a<0 to policzy potęgę ujemną,
        long wynik = 1;
        for (int i = 0; i < b; i++) {
            if (a == 0){
                System.out.println(-1);
            }
            wynik = a * wynik;
        }
        return wynik;
    */