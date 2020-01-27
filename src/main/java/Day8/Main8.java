package Day8;


import Day6.Doctor;

import java.util.*;

public class Main8 {

    public static void main(String[] args) {

        /*List<String> toys = new ArrayList<String>();
        toys.add("rower");
        toys.add("rolki");
        toys.add("piłka");
        toys.add("lalka");
        toys.add("klocki");
        toys.add("puzzle");
        System.out.println(toys);

        for (String toy : toys) {
            System.out.println(toy);
        }

        for (int i = 0; i < toys.size(); i++) {
            System.out.println(toys.get(i));
        }

        for (int i = 0; i < toys.size(); i++) {
            System.out.println(i + " element " + toys.get(i));

        }

        System.out.println(toys.indexOf("piłka"));
        System.out.println(toys.contains("klocki"));
        System.out.println(toys.remove(3));

        for (int i = 0; i < toys.size(); i++) {
            System.out.println(toys.get(i));
        }
        System.out.println(toys.subList(1, 4));

        List<String> newList = new ArrayList<String>();
        newList = toys.subList(2, 5);
        for (int i = 0; i < newList.size(); i++) {
            System.out.println(newList.get(i));
        }

        toys.add(3, "hulajnoga");
        System.out.println(toys);

        Set<String> mySet = new HashSet<String>();
        mySet.add("jeden");
        mySet.add("dwa");
        mySet.add("trzy");
        mySet.add("cztery");
        mySet.add("pięć");
        mySet.add("sześć");
        System.out.println(mySet);

        mySet.add("dwa");
        System.out.println(mySet);
        System.out.println(mySet.contains("trzy"));
        mySet.addAll(toys);
        System.out.println(mySet);

        Queue<String> myQueue = new LinkedList<String>();
        myQueue.add("biały");
        myQueue.add("czerwony");
        myQueue.add("zielony");

        System.out.println(myQueue);

        Queue<String> myQueue2 = new PriorityQueue<String>();
        myQueue2.add("niebieski");
        myQueue2.add("fioletowy");
        myQueue2.add("różowy");

        System.out.println(myQueue2);

        LinkedList<String> myList2 = new LinkedList<String>();
        myList2.add("żółty");
        myList2.add("czarny");
        myList2.add("brązowy");

        System.out.println(myList2);*/


        Map<String, String> map = new HashMap<>();
        map.put("PRL", "Warszawa");
        map.put("NRD", "Berlin");
        map.put("RFN", "Bonn");
        map.put("Czechosłowacja", "Praga");
        map.put("PRL", "Kraków");
        map.put(null, "Moskwa");

        //System.out.println(map.get(null));
        for (String s : map.keySet()) {
            System.out.println(s);
        }
        System.out.println();

        for (String r : map.values()) {
            System.out.println(r);
        }
        System.out.println();

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry);
        }

        System.out.println();

        for (String s : map.keySet()) {
            System.out.println(s + " stolicą jest " + map.get(s));
        }


    }

/*        Collections.sort(toys, null);
    }

    class DoctorComparator implements Comparator<Doctor> {

        @Override
        public int compare(Doctor o1, Doctor o2) {
            return o1.getSalary() - o2.getSalary();
        }
    }*/

//Class<Nurse> nurseClass = Nurse.class;
//        System.out.println(nurseClass.getName());


    // readAge();
    //readNewAge();
        /*try {
            readNewAge2();
        } catch (Exception e1) {
            System.out.println(e1.getMessage());
        }*/
/*try{
    readData();
}catch (Exception e) {
    System.out.println(e.getMessage());
}*/
      /*try{
            readNewData();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }*/


    public static int readAge() {
        try {
            System.out.println("Podaj wiek:");
            Scanner scan = new Scanner(System.in);
            int a = scan.nextInt();
            System.out.println("Oto podany przez Ciebie wiek: " + a);
            return a;
        } catch (InputMismatchException e) {
            System.out.println("To nie jest wartość liczbowa. Podaj prawidłowy wiek.");
        }
        int b = readAge();   // może być tylko: return 0; lub return -1; lepiej wpisać -1
        return b;
    }

    public static int readNewAge() {
        while (true) {
            try {
                System.out.println("Podaj wiek:");
                Scanner scan = new Scanner(System.in);
                int a = scan.nextInt();
                System.out.println(a);
                return a;
            } catch (InputMismatchException e1) {
                System.out.println("To nie jest wartość liczbowa. Podaj prawidłowy wiek.");
            } finally {
                System.out.println("Brawo!!!");
            }
        }
    }

    public static int readNewAge2() throws Exception {
        try {
            System.out.println("Podaj wiek:");
            Scanner scan = new Scanner(System.in);
            int a = scan.nextInt();
            System.out.println("Oto podany przez Ciebie wiek: " + a);
            return a;
        } catch (InputMismatchException e) {
            System.out.println("To nie jest wartość liczbowa. Podaj prawidłowy wiek.");
            throw new Exception("To jest błąd.");
        }
    }

    public static void readData() throws Exception {
        System.out.println("Podaj imię:");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Podaj nazwisko:");
        Scanner scan2 = new Scanner(System.in);
        String surname = scan.nextLine();
        System.out.println("Podaj wiek:");
        Scanner scan3 = new Scanner(System.in);
        int age = scan.nextInt();
        if (age < 0 || age > 120) {
            throw new Exception("To nie jest prawidłowy wiek!!!");
        }
        System.out.println(name);
        System.out.println(surname);
        System.out.println(age);
    }

    public static void readNewData() {
        System.out.println("Podaj imię:");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Podaj nazwisko:");
        Scanner scan2 = new Scanner(System.in);
        String surname = scan.nextLine();
        System.out.println("Podaj wiek:");
        Scanner scan3 = new Scanner(System.in);
        int age = scan.nextInt();
        if (age < 0 || age > 120) {
            throw new RuntimeException("To nie jest prawidłowy wiek!!!");
        }
        System.out.println(name);
        System.out.println(surname);
        System.out.println(age);
    }

    public static void wypelnijFormularz() throws Exception {
        readNewData();
        System.out.println("Tu jest jakies wypełnienie formularza");
    }

    public static void wypełnijIwyślijDoUrzędu() throws Exception {
        wypelnijFormularz();
        System.out.println("Wysyłanie do Urzędu");
    }
}