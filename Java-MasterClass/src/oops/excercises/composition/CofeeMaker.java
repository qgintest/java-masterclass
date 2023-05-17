package oops.excercises.composition;

public class CofeeMaker {

    private boolean hasWorkToDo;

    public void brewCofee(){
        if(hasWorkToDo == true){
            System.out.println("Coffee is brewing");
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
