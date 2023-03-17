package oops.inheritance;

public class Dog extends Animal {

    private String earShape;

    private String tailShape;



    public Dog(){
        super("Mut", "Big", 50);
    }

    public Dog(String type, double weight){
        this(type, weight, "perky", "curled");
    }

    public Dog(String type, double weight, String earShape, String tailShape){
        super(type, weight < 15 ? "small" : (weight < 35 ? "Medium" : "Large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    public void makeNoise(){

        if(type == "Wolf"){
            System.out.println("Howl");
        }else{
            bark();
        }
        System.out.println();
    }

    @Override
    public void move(String speed){
        super.move(speed);
        if(speed == "slow"){
            walk();
            waigTail();
        }else{
            run();
            bark();
        }
        System.out.println();
    }

    private void bark(){
        System.out.println("Woof! ");
    }

    private void run(){
        System.out.println("Dog Running ");
    }

    private void walk(){
        System.out.println("Dog Walking ");
    }

    private void waigTail(){
        System.out.println("Tail Wagging ");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }
}
