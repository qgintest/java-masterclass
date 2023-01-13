package controlFlowStmts.excercises;

public class Sum3and5Challenge {

    public static void main(String[] args) {

        int counter = 0;
        int sum = 0;

        for(int i = 1; i <=1000; i++){
            if(((i % 3) == 0) && ((i % 5) == 0)){
                System.out.println(i + " can be divided by both 3 and 5");
                counter++;
                sum+=i;
                if(counter == 5){
                    break;
                }
            }
        }

        System.out.println("Sum of numbers = " + sum);

    }
}
