package controlFlowStmts.excercises;

public class LastDigitChecker {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(123,246,232));
        System.out.println(hasSameLastDigit(23,32,42));
        System.out.println(hasSameLastDigit(9,99,999));

    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3){

        boolean answer =  false;

        if(isValid(num1) && isValid(num2) && isValid(num3)){

            if(((num1 % 10) == (num2 % 10)) || ((num1 % 10) == (num3 % 10)) || ((num2 % 10) == (num3 % 10))){
                answer = true;
            }

        }

        return answer;

    }

    public static boolean isValid(int number){
        if((number >=10) && (number <= 1000)){
            return true;
        }else{
            return false;
        }
    }
}
