package controlFlowStmts;

public class ForLoop {

    public static void main(String[] args) {
        for(int counter = 1; counter <=5; counter++){
            System.out.println(counter);
        }

        for(double i = 1.0; i <= 5.0; i++){
            System.out.println(calculateInterest(10000, i));
        }

        for(double rate = 7.5; rate <=10; rate+=0.25){
            if(rate == 9){
                break;
            }
            System.out.println(calculateInterest(100, rate));
        }

    }

    public static double calculateInterest(double amount, double interestRate){

        return (amount * (interestRate  / 100));
    }
}
