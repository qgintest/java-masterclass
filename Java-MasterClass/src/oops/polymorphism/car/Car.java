package oops.polymorphism.car;

public class Car {

    private String description;

    public Car(String description){
        this.description = description;
    }


    public void startEngine(){
        System.out.println("Engine for car started");
    }

    public void drive(){
        System.out.println("Driving " + this.getClass().getSimpleName());
    }

    protected void runEngine(){
        System.out.println("Engine running");
    }
}

class GasPoweredCar extends Car{

    private double avgKmPerLiter;
    private int cylinders;

    public GasPoweredCar(String description, double avgKmPerLiter, int cylinders) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println("Gas powered car started");
    }

    @Override
    public void drive() {
        System.out.println("Driving " + this.getClass().getSimpleName());
    }
}

class ElectricCar extends Car{

    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.println("ELectric car started");
    }

    @Override
    public void drive() {
        System.out.println("Driving " + this.getClass().getSimpleName());
    }
}

class HybridCar extends Car{
    private double avgKmPerLiter;
    private int batterySize;
    private int cylinders;

    public HybridCar(String description, double avgKmPerLiter, int batterySize, int cylinders) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println("Hybrid Engine running");
    }

    @Override
    public void drive() {
        System.out.println("Driving " + this.getClass().getSimpleName());
    }
}
