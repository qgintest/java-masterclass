package conditionalWithOperators;

public class IfThen {
    public static void main(String[] args) {
            boolean print = true;

            if(print == true) System.out.println("Print");

            if(print == true)
                System.out.println("Print");

            //below demonstrates what happens if code-blocks are not used
            print = false;

            if(print == true)
            System.out.println("Print");
            System.out.println("Second Print");

            if(print == true){ //none will print out
                System.out.println("don't Print me");
                System.out.println("don't Print me too");
            }

    }
}
