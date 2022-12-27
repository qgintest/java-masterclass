package datatypes;

public class Operators {

    public static void main(String[] args) {
        int num = 1 + 2; //operator is + and =, operands are 1 and 2, expression is 1 + 2 that will return the result 3

        int result = num + 1;

        System.out.println(result);
        System.out.println(num); //num does not change

        char a = 'A';
        char b = 'B';

        System.out.println(a + b); //result is 131 because when you use + operator with chars, its the numbers in memory that get added together

        System.out.println("" + a + b); //result is AB because string literal is included so it will concat them

        num = 5 * 5;
        System.out.println(num);

        num = 5 / 5;
        System.out.println(num);

        num = 5 % 5;
        System.out.println(num);

        num = 15 % 4; //4 goes into 15 3 times OR 4 + 4 + 4 = 12, 15 - 12 = 3 remainder
        System.out.println(num);

        //Shorthands////////////////
        int n = 1;
        n++; //post-fix increment operator will add plus 1
        System.out.println(n);

        n--; //post-fix decrement operator will subtract by 1
        System.out.println(n);

        n+=5; //compound assignment operator will do the same thing, added bonus of controlling by what number you want to increment/decrement by
        System.out.println(n);

        n-=5.5;
        System.out.println(n); //notice how result is zero because it return value is int impliciently.

        n = 6;
        //n = 6 - 5.5; //compile error becaues you need to cast
        n = (int) (6 - 5.5); //must enclose () around both operands so tell java to case the result of the two operands, not just the first number
        System.out.println(n);

        double d = 5;
        d-=4.5;
        System.out.println(d); //since d is of double type it is being calculated from the other double data type 4.5 so the correct result comes up
    }
}
