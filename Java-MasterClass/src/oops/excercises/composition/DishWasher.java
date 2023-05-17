package oops.excercises.composition;

public class DishWasher {

    private boolean hasWorkToDo;

    public void doDishes(){

        if(this.hasWorkToDo == true){
            System.out.println("Dishwasher is running");
        }
        hasWorkToDo = false;
    }

    public void setHasWorkToDo(boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }

    public boolean getHasWorkToDo() {
        return this.hasWorkToDo;
    }
}
