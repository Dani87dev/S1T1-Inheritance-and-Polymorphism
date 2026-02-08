package n1exercice2;

public class Car {

    private static final String BRAND = "Dacia";
    private static String model = "Sandero";
    private final int POWER;

    public Car(int power) {
        this.POWER = power;
    }


    public static void brake() {
        System.out.println("The vehicle is breaking down");
    }

    public void accelerate() {
        System.out.println("The vehicle is accelerating");
    }

}
