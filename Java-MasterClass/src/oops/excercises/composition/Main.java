package oops.excercises.composition;

public class Main {

    public static void main(String[] args) {
        SmartKitchen myKitchen = new SmartKitchen();

//        myKitchen.getDishWasher().setHasWorkToDo(true);
//        myKitchen.getRefigerator().setHasWorkToDo(true);
//        myKitchen.getCofeeMaker().setHasWorkToDo(true);
//
//        myKitchen.getDishWasher().doDishes();
//        myKitchen.getRefigerator().orderFood();
//        myKitchen.getCofeeMaker().brewCofee();

        myKitchen.setKitchenState(true, false, true);
        myKitchen.doKitchenWork();



    }
}
