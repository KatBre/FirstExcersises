package Day1;

public class Main {

    public static void main(String[] args) {
        long i = 1000L;
        while (i < 2000) {
            float x = 1.02f;
            int y = 70;
            int j = 0;
            long z;
            z = i *= x;
            i = z + y;
            i++;
            System.out.println("tyle mieszkańców jest po " + "roku " + i++);
        }
    }
}       /*System.out.println("hello world");
        System.out.println("hello world second time");
        System.out.println("hello world third time");
        System.out.println("hello world last time");
        String text = "Hi, hello";
        System.out.println(text);
        String text2 = "Hello second time";
        System.out.println(text2);
        String text3 = "text";
        System.out.println(text3);
        int liczba = 10;
        System.out.println(liczba);
        long liczby = 10582L;
        System.out.println(liczby);
        double przecinek = 10.823;
        System.out.println(przecinek);
        float innaLiczba = 10f;
        System.out.println(innaLiczba);
        boolean prawda = true;
        System.out.println(prawda);
        char znak = 'd';
        System.out.println(znak);
        System.out.println(liczby + " lub " + przecinek);
       int a1 = 2;
       int a2 = 4;
       int a3 = 6;
       int a4 = a1+a2+a3;
        System.out.println(a1+a2+a3);
        System.out.println(a1-a2-a3);
        System.out.println(a1*a2*a3);
        System.out.println(a1/a2/a3);
        System.out.println(a1%a2%a3);
        System.out.println(a4);
       Scanner scan = new Scanner(System.in);
       String tekst = scan.nextLine();
        System.out.println(tekst);
        String tekst2 = scan.nextLine();
        System.out.println(tekst2);
        System.out.println(tekst2);
        String tekst3 = scan.nextLine();
        System.out.println(tekst3);
        System.out.println(tekst3);
        System.out.println(tekst3);
        Scanner scan = new Scanner(System.in);
        int b = scan.nextInt();
        int x = b % 6 + 2;
        System.out.println(x);
        Scanner scan = new Scanner(System.in);
        int b1 = scan.nextInt();
        int b2 = scan.nextInt();
        if (b1>b2) {
            System.out.println(" Pierwsza jest większa od drugiej");
        } else {
                System.out.println(" Druga jest większa od pierwszej");
        }
        Scanner scan = new Scanner(System.in);
        int b1 = scan.nextInt();
        int b2 = scan.nextInt();
        int b3 = scan.nextInt();
        if (b1>b2&&b3==0) {
            System.out.println("A");
        } else {
            System.out.println("B");
        }
        Scanner scan = new Scanner(System.in);
        int b1 = scan.nextInt();
        int b2 = scan.nextInt();
        int b3 = scan.nextInt();
        if (b1 > b2 && b1 > b3) {
            System.out.println("b1");
        } else {
            if (b2 > b1 && b2 > b3) {
                System.out.println("b2");
            } else {
                System.out.println("b3");
            }
        }
        Scanner scan = new Scanner(System.in);
        int b1 = scan.nextInt();
        if (b1 % 2 == 0) {
            System.out.println("Ta liczba jest parzysta");
        } else {
            System.out.println("Ta liczba jest nieparzysta");
        }
        Scanner scan = new Scanner(System.in);
        int b1 = scan.nextInt();
        if (b1 > 0) {
            System.out.println("Ta liczba jest większa od zera");
        } if (b1 < 0) {
            System.out.println("Ta liczba jest mniejsza od zera");
        } if (b1 == 0) {
            System.out.println("Ta liczba jest rowna zero");
        }
        int i = 0;
        while (i < 100) {
            i = i + 1;
            System.out.println(i);
        }
for (int i = 100; i > -1; i--) {
    System.out.println(i);
}
        Scanner scan = new Scanner(System.in);
        int b1 = scan.nextInt();
        int b2 = scan.nextInt();
        int b3 = scan.nextInt();
        int b4 = scan.nextInt();
        if (b1 > b2 && b1 > b3 && b1 > b4) {
            System.out.println("b1");
        } else {
            if (b2 > b1 && b2 > b3 && b2 > b4) {
                System.out.println("b2");
            } else {
                if (b3 > b1 && b3 > b2 && b3 > b4) {
                    System.out.println("b3");
            } else {
                System.out.println("b4");
            }
    }}

        int i = 4;
        while (i < 100) {
            i = i + 1;
            System.out.println(i);
        }
            int i = 54;
            while (i < 150) {
                i = i + 1;
                System.out.println(i);
         }
        int i = 100;
        while (i > 0) {
            i = i - 1;
            System.out.println(i);
        }
        int i = 0;
        while (i < 100) {
            i = i + 2;
            System.out.println(i);
        }
        int i = 0;
        while (i < 100) {
            i = i + 2;
            System.out.println(i);
        }
        int i = 0;
        while (i < 100) {
            i = i + 1;
            if (i % 2 == 0) {
                System.out.println("podzielne przez 2");
            } else {
                if (i % 3 == 0) {
                    System.out.println("podzielne przez 3");
                } else {
                    if (i % 5 == 0) {
                        System.out.println("podzielne przez 5");
                    }
                    System.out.println(i++);
                }
            }
        }
        for (int i = 0; i < 101; i++) {
            System.out.println(i);
        }
        int i = 0;
        if (i % 2 == 0) {
            System.out.println(i++ +"podzielne przez 2");
        } else {
            if (i % 3 == 0) {
                System.out.println("podzielne przez 3");
            } else {
                if (i % 5 == 0) {
                    System.out.println("podzielne przez 5");
                }
            }


        }
}*/
