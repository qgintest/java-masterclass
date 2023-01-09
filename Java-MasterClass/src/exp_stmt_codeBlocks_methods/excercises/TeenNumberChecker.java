package exp_stmt_codeBlocks_methods.excercises;

public class TeenNumberChecker {

    public static void main(String[] args) {
        System.out.println(hasTeen(9, 99, 19)); //true
        System.out.println(hasTeen(23, 15, 42));//true
        System.out.println(hasTeen(22, 23, 44));//false



    }

    public static boolean hasTeen(int num1, int num2, int num3){
        boolean isTeen = false;

        if((num1 >= 13 && num1 <=19) || (num2 >= 13 && num2 <=19) || (num3 >= 13 && num3 <=19)){
            isTeen = true;
        }

        return isTeen;
    }
}
