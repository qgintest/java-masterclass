package oops.excercises.composition;

public class Refigerator {

    private boolean hasWorkToDo;

    public void orderFood(){

        if(this.hasWorkToDo == true){
            System.out.println("Food is ordered");
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
