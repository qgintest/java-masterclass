package controlFlowStmts.excercises;

import java.sql.SQLOutput;

public class PrimeNumberChallenge {

    /*
    a whole number greater than 1 that cannot be exactly divided by any whole number other than itself and 1 (e.g. 2, 3, 5, 7, 11).

     */

    public static void main(String[] args) {
        System.out.println("10 is " + (isPrime(10) ? "" : "NOT ") + " a Prime Number");
        int numOfPrimeNumbers = 0;

        for(int prime = 2; prime <= 1000; prime++){

            if(isPrime(prime)){
                System.out.println("Prime Number is: " + prime);
                numOfPrimeNumbers++;
                if(numOfPrimeNumbers == 3){
                    break;
                }
            }

        }

    }

    public static boolean isPrime(int wholeNumber){

        if(wholeNumber <=2){ //check if number is less than or equal to two, if it is, its not a prime
            return (wholeNumber == 2);
        }

        for(int divisor = 2; divisor < wholeNumber / 2; divisor++){
            if((wholeNumber % divisor) == 0){
                return false;
            }
        }

        return true;
    }
}
