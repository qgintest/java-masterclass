package controlFlowStmts.excercises;

public class ShareDigit {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 44));
        System.out.println(hasSharedDigit(-23, 23));
    }

    public static boolean hasSharedDigit(int num1, int num2){

        boolean answer = false;

        if((num1 >=10 && num1 <=99) && (num2 >=10 && num2 <=99)){


            if((num1 / 10) == (num2 % 10)){
                answer = true;
            }else if((num1 / 10) == (num2 / 10)){
                answer = true;
            }else if ((num1 % 10) == (num2 % 10)){
                answer = true;
            }else if((num1 % 10) == (num2 / 10)){
                answer = true;
            }
        }

        return answer;
    }
}
