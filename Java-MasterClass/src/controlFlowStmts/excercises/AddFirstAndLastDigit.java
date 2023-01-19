package controlFlowStmts.excercises;

public class AddFirstAndLastDigit {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(123));
        System.out.println(sumFirstAndLastDigit(-123));
        System.out.println(sumFirstAndLastDigit(00));

    }

    public static int sumFirstAndLastDigit ( int number ) {

        //strategy is to get last digit save them outside the loop, inside the loop, you leep removing the digits until
        //there is nothing left

        if ( number >=0 ) {
            int sum = 0;
            int lastNumber = number % 10;
                                         //notice here how incrementor is i = i / 10 which will remove the last digit from number
            for (int i = number; i != 0; i /= 10) {
                sum = lastNumber + i;
            }
            return sum;
        }
        return -1;
    }

    public static int sumFirstAndLastDigitwhileLoop ( int number ) {

        int sum;
        int lastDigit;
        int firstDigit;

        if (number >= 0) {
            lastDigit = number % 10;

            while (number >= 10) {
                number = number / 10;
            }

            firstDigit = number;
            sum = lastDigit + firstDigit;
            return sum;
        }
        return -1;
    }
}
