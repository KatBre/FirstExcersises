package Day7;

public class PassengerCar implements Car {

    public void drive(int speed) {
        System.out.println("I am Passenger Car");
        System.out.println("I am Passenger Car and I am starting drive with speed " + speed);
    }

    public boolean getGearBox() {
        System.out.println("I am Passenger Car");
        System.out.println("Manual");
        return false;
    }

    public void stop() {
        System.out.println("I am Passenger Car");
        System.out.println("I am stopping");
    }

    public int getDoorNumber() {
        System.out.println("I am Passenger Car");
        System.out.println("5");
        return 5;
    }

    public int getMaxSpeed() {
        System.out.println("I am Passenger Car");
        System.out.println("220");
        return 220;
    }

    public int getFuelType() {
        System.out.println("I am Passenger Car");
        System.out.println("95");
        return 2;
    }
}
