package controlFlowStmts.excercises;

public class EvenDigitSum {

    /*

 Write a method named getEvenDigitSum with one parameter of type int called number.

The method should return the sum of the even digits within the number.

If the number is negative, the method should return -1 to indicate an invalid value.


     */

    public static void main(String[] args) {
        //System.out.println(getEvenDigitSum(-12345));
        System.out.println(getEvenDigitSum(1234568));
    }

    public static int getEvenDigitSum(int number){

        int sum = 0;

        if(number < 0){
            return -1;
        }

        for (int i = number; i != 0; i/=10){
            int lastDigit = i % 10;
            if((lastDigit % 2) == 0){
                sum+=lastDigit;
            }
        }

        return sum;

    }


}
