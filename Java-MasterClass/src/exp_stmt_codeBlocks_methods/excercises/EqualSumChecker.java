package exp_stmt_codeBlocks_methods.excercises;

/*

Write a method hasEqualSum with 3 parameters of type int.

The method should return boolean and it needs to return true if the sum of the first
and second parameter is equal to the third parameter. Otherwise, return false.

 */
public class EqualSumChecker {

    public static void main(String[] args) {
        System.out.println(hasEqualSum(1, 1, 2)); // true
        System.out.println(hasEqualSum(1, -1, 0)); // true
        System.out.println(hasEqualSum(1, 1, 1));   //false

    }

    public static boolean hasEqualSum(int num1, int num2, int num3){
        return (num1 + num2) == num3 ? true: false;
    }
}
