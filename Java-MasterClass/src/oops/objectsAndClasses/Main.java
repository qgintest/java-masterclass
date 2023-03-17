package oops.objectsAndClasses;

public class Main

{
    public static void main(String[] args) {
        Car car = new Car();
        //car.describeCar();

        System.out.println(car.getMake());
        car.setMake("Toyota");
        System.out.println(car.getMake());

        //System.out.println(car.getMake());
        //System.out.println(car.getModel());

        Car car2 = new Car();
        car2.setColor("Black");

        car2.getMake();
    }
}
