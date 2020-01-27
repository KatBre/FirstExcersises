package Day6;

public class DoctorServis {
    private static final int NUMBERS_OF_DOCTORS = 4;

    public static Doctor[] docs() {
        Doctor d1 = new Doctor("Józef", "Kowalski", 47, 4500, "okulista", 1000);
        Doctor d2 = new Doctor("Marian", "Nowak", 39, 3400, "dermatolog", 500);
        Doctor d3 = new Doctor("Stefan", "Burczymucha", 56, 8700, "neurolog", 15000);
        Doctor d4 = new Doctor("Maria", "Żurek", 48, 16400, "internista", 4000);

        Doctor[] doctbl = {d1, d2, d3, d4};
        return doctbl;
    }

    public static Doctor[] createDoctors() {
        Doctor[] doctors = new Doctor[NUMBERS_OF_DOCTORS];
        doctors[0] = new Doctor("Józef", "Kowalski", 47, 4500, "okulista", 1000);
        doctors[1] = new Doctor("Marian", "Nowak", 39, 3400, "dermatolog", 500);
        doctors[2] = new Doctor("Stefan", "Burczymucha", 56, 8700, "neurolog", 15000);
        doctors[3] = new Doctor("Maria", "Żurek", 48, 6400, "internista", 4000);
        return doctors;
    }


    public static Doctor showDoctorWithHighestSalary(Doctor[] doctbl) {
        Doctor d = doctbl[0];
        for (int i = 1; i < doctbl.length; i++) {
            if (doctbl[i].getSalary() > d.getSalary()) {
                d = doctbl[i];
            }
        }
        System.out.println("Najwięcej zarabia: ");
        return d;
    }

    public static Doctor checkDoctorName(Doctor[] doctbl, String surname) {
        for (int i = 0; i < doctbl.length; i++) {
            if (doctbl[i].getSurname().equals(surname)) {
                return doctbl[i];
            }
        }
        return null;
    }

    public static int getBiggestNumber(int[] numbers) {
        int biggestNumber = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > biggestNumber) {
                biggestNumber = numbers[i];
            }
        }
        return biggestNumber;
    }
}



