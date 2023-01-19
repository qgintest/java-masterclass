package controlFlowStmts.excercises;

/*

Number Palindrome
Write a method called isPalindrome with one int parameter called number.

The method needs to return a boolean.

It should return true if the number is a palindrome number otherwise it should return false.

3 Big tips
 - to get last digit number % 10
 - to get first digit, (number * 10) + lastDigit
 - to remove last digit, number / 10
 */

public class PlaindromeNumber {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));  //true
        System.out.println(isPalindrome(707)); //true
        System.out.println(isPalindrome(11212)); //false
    }

    public static boolean isPalindrome(int number)
    {
        if (number < 0)
        {
            number *= -1;
        }

        int reverse = 0;
        int stored = number;
        while (stored > 0)
        {
            //To increase place value (getting first digit)
            reverse = (reverse * 10) + (stored % 10);

            // drop the least-significant digit
            stored /= 10;   // same as number = number / 10;
        }

        if (number == reverse)
        {
            return true;
        } else
        {
            return false;
        }

    }


}
