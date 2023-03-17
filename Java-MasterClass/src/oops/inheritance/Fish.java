package oops.inheritance;

public class Fish extends Animal{

    public Fish(String type){
        this(type, 5, 2, 8);
    }

    public Fish(String type, double weight, int fins, int gills){
        super(type, "small", weight);
        this.fins = fins;
        this.gills = gills;
    }



    private int fins;

    private int gills;

    private void moveMuscles(){
        System.out.println("fish moved muscles ");
    }

    private void moveBackFins(){
        System.out.println("Fish moved back fins");
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        moveMuscles();
        if(speed == "fast"){
            moveBackFins();
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Fish{" +
                "fins=" + fins +
                ", gills=" + gills +
                "}" + super.toString();
    }
}
