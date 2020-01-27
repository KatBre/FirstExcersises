package Day2;

public class Main2 {

    public static void main(String[] args) {
        int[] tablica = new int[100];
        for (int i = 0; i < tablica.length; i++)
            if (tablica[i] % 2 == 0) {
                System.out.println(0);
            } else {
                    System.out.println(1);
                }
            }
    }




    /*public static void main(String[] args) {

        int[] tablica = new int[100];
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = 10;
            System.out.println(tablica[i]);
        }
    }
}


        public static void main(String[] args) {
        String[] tab = new String[4]; // ew. sposób: String[] tab = {"aaa", "bbb", "ccc", "ddd"}
        tab[0] = "aaa";
        tab[1] = "bbb";
        tab[2] = "ccc";
        tab[3] = "ddd";
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
    }
}
    public static void main(String[] args) {
        method3("q", "w", "e", "r", "t", "y", "u", "i", "o", "p");
    }

    public static void method2(String... p) {
        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i]);
        }
    }

    public static void method3(String... p) {
        for (int i = p.length - 1; i >= 0; i--) {
            System.out.println(p[i]);
        }
    }
}
        public static void main(String[] args) {
        method("a","b","c","d","e");
    }
    public static void method(String... g) {
        System.out.println(g[0]);
        System.out.println(g[1]);
        System.out.println(g[2]);
        System.out.println(g[3]);
        System.out.println(g[4]);
        }
    }
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int s = abs(x);
        System.out.println(s);
    }


    public static int abs(int a) {
         if (a < 0){
            return (-a);
    }
           return (a);
    }
}
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();
        int i = calculateNumbers(x, y, z);
        System.out.println(i);
    }
        /*Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        multiplyText("powtórzony tekst", x);
    }

    public static void multiplyText(String tekst5, int d) {
        int i = 0;
        while (i < d) {
            i = i + 1;
            System.out.println(tekst5);
    }

        public static int calculateNumbers(int a, int b, int c) {
            int d = ((a + b) % c);
            return d;
        }
        Scanner scan = new Scanner(System.in);
        String x = scan.nextLine();
        String s = multiplyText2(x);
        System.out.println(s);
    }


    public static String multiplyText2(String w1) {
        return w1 + " " + w1 + " " + w1;
    }*/








