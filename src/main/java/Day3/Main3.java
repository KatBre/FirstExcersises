package Day3;

import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        int[][] tab3 = new int[5][5];
        for (int i = 0; i < tab3.length; i++) {
            for (int j = 0; j < tab3.length; j++) {
                tab3[i][j] = 10;
                System.out.println(tab3[i][j]);
            }
        }
    }
}

        /*int [][] table = {
                {5,5,5,5,5},
                {5,5,5,5,5},
                {5,5,5,5,5},
                {5,5,5,5,5},
                {5,5,5,5,5},
        }
        int[][] table2 = {
                table2[0][0] = 5;
                table2[0][1] = 5;
                table2[0][2] = 5;
                table2[0][3] = 5;
                table2[0][4] = 5;
                table2[1][0] = 5;
                table2[1][1] = 5;
                table2[1][2] = 5;
                table2[1][3] = 5;
                table2[1][4] = 5;
                table2[2][0] = 5;
                table2[2][1] = 5;
                table2[2][2] = 5;
                table2[2][3] = 5;
                table2[2][4] = 5;
                table2[3][0] = 5;
                table2[3][1] = 5;
                table2[3][2] = 5;
                table2[3][3] = 5;
                table2[3][4] = 5;
                table2[4][0] = 5;
                table2[4][1] = 5;
                table2[4][2] = 5;
                table2[4][3] = 5;
                table2[4][4] = 5;
        }
    }









    }

        /*int [][] matrix = {
                {0,1,2},
                {2,4,8},
                {4, 8,16},
        };
    }
    }





        /*short s = 10;
        int i = 20;
        float f = 15;
        double d = 18.234567;

        int j = (int) d; //to jest JAWNE RZUTOWANIE
        d = i; //to jest NIEJAWNE RZUTOWANIE
        testRzutowanie(s, (int) d, f, d);
    }

    public static void testRzutowania(shott s, int i, float f, double d) {
        int[] tab = new int[100];
        String s1 = "skjkdldd";
        for(int k = 0; k < 20; k+=){
            int z
    }
}
}

        /*Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        switch (x) {
            case 80:
                System.out.println("To jest liczba 80");
                break;
            case 120:
                System.out.println("To jest liczba 120");
                break;
            case 200:
                System.out.println("To jest liczba 200");
                break;
            default:
                System.out.println("Co jest za liczba?");
        }
    }
}















        /*String y = scan.nextLine();
        System.out.println(x.length());
        int lenght2 = x.length() / 2;
        System.out.println(x.substring(0, lenght2));
        System.out.println(x.toUpperCase());
        System.out.println(x.toLowerCase());
        System.out.println(x.replace(" ", "."));
        if (y.equals(x)) {
            System.out.println("Te napisy są takie same");
        } else {
            System.out.println("Te napisy są różne");
        }
    }

}

    /*public static int dodawanie(int a, int b) {
        int wynik = a;
        int i = 0;
        while (i < b) {
            wynik++;
            i++;
        }
        return wynik;

    }

    public static int dodawanie2(int a, int b) {
        while (b > 0) {
            a++;
            b--;
        }
        return a;
    }


    String s1 = "zdanie";
        String s2 = "lkskhsja";
        String s3 = new String(s1 + s2);
        String s4 = s1 + s3;
        System.out.println(s1.length());
        System.out.println(s1.substring(1, 4));
        System.out.println(s1.substring(2, 5));
        System.out.println(s1.substring(2));
        int lenght = s1.length();
        System.out.println(s1.substring(2, lenght));
        String substring = s1.substring(2, lenght);
        System.out.println(substring);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);






    public static void print20() {
        for (int i = 0; i <= 20; i++) {
            System.out.println(i);
        }
    }

   public static void zad2if() {
        for (int i = 1; i < 40; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public static void zad2() {
        for (int i = 1; i < 40; i += 2) {
            System.out.println(i);
        }
    }
    public static void zad2bez40(){
        int odd = 1;
        int i = 0;
        while (i < 20) {
            System.out.println(odd);
            odd += 2;
            i++;
        }
    }

    public static void zad2bez40for(){
        int odd = 1;
        for(int i = 0; i <20; i++){
            System.out.println(odd);
            odd += 2;
        }
    }*/
