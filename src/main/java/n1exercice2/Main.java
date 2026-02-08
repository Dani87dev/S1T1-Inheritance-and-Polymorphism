package n1exercice2;

public class Main {

    public static void main(String[] args) {

        System.out.println("Demonstrate how to invoke the static method.");
        Car.brake();

        System.out.println("\nDemonstrate how to invoke the NON static method.");
        Car cotxeDani = new Car(1100);
        cotxeDani.accelerate();

    }

}
