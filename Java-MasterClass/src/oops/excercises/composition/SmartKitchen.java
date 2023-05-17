package oops.excercises.composition;

public class SmartKitchen {



    private CofeeMaker cofeeMaker;

    private DishWasher dishWasher;

    private Refigerator refigerator;

    public SmartKitchen(){
        cofeeMaker = new CofeeMaker();
        dishWasher = new DishWasher();
        refigerator = new Refigerator();
    }

    public CofeeMaker getCofeeMaker() {
        return cofeeMaker;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refigerator getRefigerator() {
        return refigerator;
    }

    public void setKitchenState(boolean addWater, boolean pourMilk, boolean loadDishWasher){
        cofeeMaker.setHasWorkToDo(addWater);
        refigerator.setHasWorkToDo(pourMilk);
        dishWasher.setHasWorkToDo(loadDishWasher);
    }

    public void doKitchenWork(){
       cofeeMaker.brewCofee();
       refigerator.orderFood();
       dishWasher.doDishes();
    }

}
