package conditionalWithOperators;

public class MoreOperators {

    public static void main(String[] args) {
        boolean isCar = false;
        if(isCar = true){
            System.out.println("should not print"); //what happens in this code?
        }

        if(!isCar){  //shorthand for not
            System.out.println("should print"); //what happens in this code?
        }

        int a = 1;
        int b = 2;
        boolean c = false;
        String d = "name";

        //below blocks output the same but 1st one is better for code readability
        if((a != 1 || b!=1) && (c == false) && d.equals("name")){
            System.out.println("should def print");
        }

        if(a != 1 || b!=1 && (c == false) && d.equals("name")){
            System.out.println("should def print");
        }


    }
}
