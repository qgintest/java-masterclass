package oops.objectsAndClasses;

public class Car {



    private String make = "Honda";
    private String model = "Accord";
    private String color = "Black";
    private int doors = 2;

    private boolean isConvertible = true;

    public void describeCar(){
        System.out.println(make);
        System.out.println(model);
        System.out.println(isConvertible);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public void setMake(String make) {

        //true value of setters and getters is using to add validation
        if(make == null) make = "unknown";
        String lowercase = make.toLowerCase();

        switch(lowercase){
            case "toyota", "honda", "saturn" -> this.make = make;
            default -> this.make = "Unsupported";
        }
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        isConvertible = convertible;
    }

    public boolean isConvertible() {
        return isConvertible;
    }
}
