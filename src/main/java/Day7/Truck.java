package Day7;

public class Truck implements Car {

    public void drive(int speed) {
        System.out.println("I am Truck");
        System.out.println("I am Truck and I am starting drive with speed " + speed);
    }

    public boolean getGearBox() {
        System.out.println("I am Truck");
        System.out.println("Automatic");
        return false;
    }

    public void stop() {
        System.out.println("I am Truck");
        System.out.println("I am stopping");
    }

    public int getDoorNumber() {
        System.out.println("I am Truck");
        System.out.println("2");
        return 2;
    }

    public int getMaxSpeed() {
        System.out.println("I am Truck");
        System.out.println("120");
        return 120;
    }

    public int getFuelType() {
        System.out.println("I am Truck");
        System.out.println("ON");
        return 1;
    }
}
