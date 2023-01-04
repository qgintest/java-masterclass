package conditionalWithOperators;

public class Operators {

    public static void main(String[] args) {
        int age = 30;

        String name = "bob";

        boolean charming = true;

        if(age == 30){
            System.out.println("age is 30");
        }

        if(age != 50){
            System.out.println("youngster");
        }

        /*
        ==
        !=
        <=
        >=
        && - Logical AND evaluates both side of expression is true
        || - Logical OR evaluates if at least one condition is met
         */

        if(age < 50 && age >20){
            System.out.println("between 20 and 50");
        }

        if(age < 10 || age >20){
            System.out.println("one condition is met");
        }

    }
}
