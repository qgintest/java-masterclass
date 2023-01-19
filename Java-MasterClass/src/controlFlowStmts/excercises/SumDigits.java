package controlFlowStmts.excercises;

public class SumDigits {

    // n % 10 = goes to the last digit
    // n = n / 10 = removes the last digit

    public static void main(String[] args) {
        System.out.println(sumDigits(12345));
    }

    public static int sumDigits(int number){
        int sum = 0;
        boolean breakLoop = false;

        do{
            if(number < 0){
                return -1;
            }else{
                //will check if its a single digit because a single digit % 10 always results in itself
                if((number % 10) == number){
                    sum+=number;
                    breakLoop = true;
                }else{
                    sum+= (number % 10);
                    number = number/ 10;
                }
            }
        }while (breakLoop == false);

        return sum;
    }
}
