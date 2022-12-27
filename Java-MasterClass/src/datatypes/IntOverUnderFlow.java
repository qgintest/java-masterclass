package datatypes;

public class IntOverUnderFlow {

    //below code will compile but will result in overflow behavior
    public static void main(String[] args) {
            int minIntValue = Integer.MIN_VALUE;
            int maxIntValue = Integer.MAX_VALUE;

            System.out.println(minIntValue);
            System.out.println(maxIntValue);

            int testMinValue = Integer.MIN_VALUE - 1;
            int testMaxValue = maxIntValue + 1;

            //underflow and overflow when you try to assign an int value outside the scope of its range
            System.out.println(testMinValue);
            System.out.println(testMaxValue);

        System.out.println(2147483647 + 1);

        //below will throw a compile error because you are trying to assign a literal value to a data type outside the range
       // int outOfRange = 2147483648;

        //you can put underscore to make code easier to read, except before and after the statement
        int maxValueEasyToRead = 2_147_483_647;



    }
}
