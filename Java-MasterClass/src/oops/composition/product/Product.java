package oops.composition.product;

public class Product {

    private String model;
    private String manufactorer;
    private int width;
    private int height;
    private int depth;

    public Product(String model, String manufactorer) {
        this.model = model;
        this.manufactorer = manufactorer;
    }
}

class Monitor extends Product{

    private int size;
    private String resolution;

    public Monitor(String model, String manufactorer, int size, String resolution) {
        super(model, manufactorer);
        this.size = size;
        this.resolution = resolution;
    }

    public Monitor(String model, String manufactorer) {
        super(model, manufactorer);
    }

    public void drawPixelAt(int x, int y, String color){
        System.out.println(String.format("Drawing Pixel at %d,%d in color %s ", x, y, color));
    }
}

class MotherBoard extends Product{

    private int ramSlots;
    private int cardSlots;

    private String bios;

    public MotherBoard(String model, String manufactorer, int ramSlots, int cardSlots, String bios) {
        super(model, manufactorer);
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public void loadingProgram(String programName){
        System.out.println("Program: " + programName + " is now loading..");
    }

    public MotherBoard(String model, String manufactorer) {
        super(model, manufactorer);
    }
}

class ComputerCase extends Product{

    private String powerSupply;

    public ComputerCase(String model, String manufactorer, String powerSupply) {
        super(model, manufactorer);
        this.powerSupply = powerSupply;
    }

    public ComputerCase(String model, String manufactorer) {
        super(model, manufactorer);
    }

    public void pressPowerButton(){
        System.out.println("Power Button Pressed");
    }
}
