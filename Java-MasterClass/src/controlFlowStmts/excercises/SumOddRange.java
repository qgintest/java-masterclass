package controlFlowStmts.excercises;

/*

Sum Odd
Write a method called isOdd with an int parameter and call it number. The method needs to return a boolean.

Check that number is > 0, if it is not return false.

If number is odd return true, otherwise return false.

Write a second method called sumOdd that has 2 int parameters start and end, which represent a range of numbers.

The method should use a for loop to sum all odd numbers in that range including the end and return the sum.

It should call the method isOdd to check if each number is odd.

The parameter end needs to be greater than or equal to start and both start and end parameters have to be greater than 0.

If those conditions are not satisfied return -1 from the method to indicate invalid input.


 */

public class SumOddRange {

    public static void main(String[] args) {
        System.out.println(sumOdd(1, 100)); // should return 2500

        System.out.println(sumOdd(-1, 100)); // should return -1

        System.out.println(sumOdd(100, 100)); // should return 0

        System.out.println(sumOdd(13, 13)); // should return 13 (This set contains one number, 13, and it is odd)

        System.out.println(sumOdd(100, -100)); // should return -1

        System.out.println(sumOdd(100, 1000));  //should return 247500
    }

    public static boolean isOdd(int number){

        boolean answer = false;

        if(number > 0){
            if(!((number % 2) == 0)){
                return true;
            }
        }
        return answer;
    }

    public static int sumOdd(int start, int end){

        int sum = 0;

        if((end >= start) && (start > 0) && (end > 0)){

            for(int i = start; i <= end; i++){
                if(isOdd(i)){
                    sum+=i;
                }
            }

        }else{
            sum = -1;
        }

        return sum;
    }
}
