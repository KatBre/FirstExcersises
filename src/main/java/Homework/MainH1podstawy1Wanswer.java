package Homework;

public class MainH1podstawy1Wanswer {

    public static void main(String[] args) {

        System.out.println("Zadanie 1:\n"+zadanie1(2,4)+"\n");

        System.out.println("Zadanie 2:\n"+zadanie2(1,2,2,8)+"\n");

        System.out.println("Zadanie 3:\n"+zadanie3(45)+"\n");

        System.out.println("Zadanie 4:");

        zadanie4();

        System.out.println("\nZadanie 5:\n"+zadanie5(5,1)+"\n");

        System.out.println("Zadanie 6:\n"+zadanie6(3)+"\n");

        System.out.println("Zadanie 7:\n"+zadanie7(86399)+"\n");

        System.out.println("Zadanie 8:");

        int[] liczby = {1, 45, 564, 7867, 34, 5456, 210};

        zadanie8(liczby);

        System.out.println("\nZadanie 9:");

        zadanie9(liczby);

        System.out.println("\nZadanie 10:");

        int[] tablica = zadanie10(liczby);

        for (int i = 0; i < liczby.length; i++){

            System.out.print(tablica[i]+"  ");

        }

    }

    public static long zadanie1 (int a, int b) {

        long c = 1;

        c = a;

        if (b == 1) {

            return c;

        } else {

            for (int i = b; i != 1; i--) {

                c = c*a;

            }

            return c;

        }

    }

    public static int zadanie2 (int...args){

        int c = args[0]*args[1];

        for (int i = 2; i < args.length; i++) {

            c = c*args[i];

        }

        return c;

    }

    public static int zadanie3 (int a) {

        int c = 0;

        while (a > 0) {

            int b = a%10;

            c += b;

            a /= 10;

        }

        return c;

    }

    public static void zadanie4 () {

        String a = "* * * * * * ==================================\n * * * * *  ==================================";

        String b = "==============================================";

        for (int i = 0; i < 4; i++) {

            System.out.println(a);

        }

        System.out.println("* * * * * * ==================================");

        for (int i = 0; i < 6; i++) {

            System.out.println(b);

        }

    }

    public static boolean zadanie5 (int a, int b) {

        if (a >= b) {

            return true;

        }

        return false;

    }

    public static int zadanie6 (int a) {

        int b = 1;

        for (int i = 1; i <= a; i++) {

            b = b*i;

        }

        return b;

    }

    public static String zadanie7 (int a) {

        int h,m,s = 0;

        h = a/3600;

        m = (a/60)-(h*60);

        s = a%60;

        String b = h+":"+m+":"+s;

        return b;

    }

    public static void zadanie8 (int[] a) {

        for (int i = 0; i < a.length; i++) {

            if (a[i] > 100) {

                System.out.println(a[i]);

            }

        }

    }

    public static void zadanie9 (int[] a) {

        for (int i = 0; i < a.length; i++) {

            if (a[i]%2 == 0) {

                System.out.println(a[i]);

            }

        }

    }

    public static int[] zadanie10 (int[] a) {

        int b = 0;

        int c = a.length-1;

        while (b < c) {

            int d = a[b];

            a[b] = a[c];

            a[c] = d;

            b++;

            c--;

        }

        return a;

    }

}