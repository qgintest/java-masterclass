package oops.objectsAndClasses.constructor;

public class Main

{
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Prius", "Black");
        //car.describeCar();

        System.out.println(car.getMake());

        Car car2 = new Car("Mozaretti", "Buick", "Green");
        car2.setColor("Black");

        System.out.println(car2.getMake());
    }
}
