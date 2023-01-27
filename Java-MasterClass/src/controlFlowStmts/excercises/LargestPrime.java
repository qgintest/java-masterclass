package controlFlowStmts.excercises;

public class LargestPrime {

    public static void main(String[] args) {
        System.out.println("Highest Prime is " + getLargestPrime( 21));
    }

    public static int getLargestPrime(int number){

        int primeNumberCount = 0;
        int highestPrimeNumber = 0;

        if(number < 0){
            return -1;
        }

        for(int i = 2; i <= number / 2; i++){
            if((number % i) != 0){
                System.out.println(i + " is a prime number");
                highestPrimeNumber = i;
                primeNumberCount++;
            }
        }

        if(primeNumberCount == 0){
            return -1;
        }

        return highestPrimeNumber;
    }
}
