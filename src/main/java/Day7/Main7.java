package Day7;


public class Main7 {

    public static void main(String[] args) {
        int[] tablica = new int[3];

        tablica[0] = 0;
        tablica[1] = 1;
        tablica[2] = 2;
        tablica[3] = 3;
        try {
            metoda();
        } catch (Exception e) {
        }
    }
        static void metoda() throws Exception{
            System.out.println("Metoda powoduje problem");
            throw new Exception();
        }
        static void metoda2() throws RuntimeException{
            int[] tablica = new int[3];

            tablica[0] = 0;
            tablica[1] = 1;
            tablica[2] = 2;
            tablica[3] = 3;
        }
    }


        /*int[] tablica = new int[3];

        try {
            tablica[0] = 0;
            tablica[1] = 1;
            tablica[2] = 2;
            tablica[3] = 3;
        } catch (Exception e) {
            System.out.println("Powód problemu");
            System.out.println(e.getMessage());
            System.out.println("Brak połączenia z internetem");
            System.out.println("Popraw połaczenie i spróbuj ponownie");
        }


    }


    int[] tablica = new int[3];

        try

    {
        tablica[0] = 0;
        tablica[1] = 1;
        tablica[2] = 2;
        tablica[3] = 3;
    }
        catch(
    ArrayIndexOutOfBoundsException e)

    {
        System.out.println("Powód problemu");
        System.out.println(e.getMessage());
        System.out.println("Brak połączenia z internetem");
        System.out.println("Popraw połaczenie i spróbuj ponownie");
    } catch(
    RuntimeException e2)

    {
        System.out.println("fkdjnsvndj");
        System.out.println("kjowk");
    }catch(
    Exception e1)

    {
        System.out.println("Za mało ramu");
        System.out.println("Kup sobie więcej");
    }
}


    EmployeeTax t1 = new Lawyer("Stefan", "Kopytko", 8700, Employment.CONTRACTOR);
        t1.calculateTax();
                System.out.println(t1.calculateTax());
                EmployeeTax t2=new Programmer("Jurek","Ogórek",15900,Employment.B2B);
                t2.calculateTax();
                System.out.println(t2.calculateTax());
                EmployeeTax t3=new Teacher("Maria","Żurek",3600,Employment.PERMANENT);
                t3.calculateTax();
                System.out.println(t3.calculateTax());
                }
                }

        /*Product p1 = new Boots("klapki", 50, 345);
        Product p2 = new Shirts("T-shirty", 38, 683);
        Product p3 = new Trousers("jeansy", 120, 12345);
        p1.getDescription();
        p2.getDescription();
        p3.getDescription();

    }
       /* Drawable d1 = new Line(8);
        Drawable d2 = new Rectangle(3, 20);
        Drawable d3 = new Triangle(4, 3, 5);
        d1.draw();
        System.out.println();
        System.out.println();
        d2.draw();
        System.out.println();
        d3.draw();
    }





        /*Truck t1 = new Truck();
        PassengerCar pc1 = new PassengerCar();

        Car c1 = new Truck();
        Car c2 = new PassengerCar();
        c1.drive(50);
        c1.getDoorNumber();
        c1.getFuelType();
        c1.getGearBox();
        c1.getMaxSpeed();
        c1.stop();
        System.out.println("===========================");
        c2.drive(60);
        c2.getDoorNumber();
        c2.getFuelType();
        c2.getGearBox();
        c2.getMaxSpeed();
        c2.stop();
    }



}


        /*Employee p1 = new Employee("Marek", "Marchewka", 45, 10000);

        Employee p2 = new Employee("Marek", "Marchewka", 45, 10000);

        if (p1 == p2) {
            System.out.println("To są te same osoby1");
        }
        else {
            System.out.println("To są różne osoby1");
        }

        if (p1.equals(p2)) {
            System.out.println("To są te same osoby2");
        }
        else {
            System.out.println("To są różne osoby2");
        }


    }
}*/