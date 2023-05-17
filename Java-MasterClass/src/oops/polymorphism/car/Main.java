package oops.polymorphism.car;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("Toyota");
        car.startEngine();

        Car gasHonda = new GasPoweredCar("Honda", 2.5, 6);
        gasHonda.startEngine();
        gasHonda.drive();

        Car electricTesla = new ElectricCar("Tesla LX", 2.4, 4);
        electricTesla.startEngine();
        electricTesla.drive();

        Car HybridToyota = new HybridCar("Toyora Secoue", 2.3, 4, 6);
        HybridToyota.startEngine();
        HybridToyota.drive();
    }
}
