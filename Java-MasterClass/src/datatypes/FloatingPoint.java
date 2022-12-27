package datatypes;

public class FloatingPoint {

    public static void main(String[] args) {
            System.out.println("Float min: " + Float.MIN_VALUE);
            System.out.println("Float: max" + Float.MAX_VALUE);

        System.out.println("Double min: " + Double.MIN_VALUE);
        System.out.println("Double: max" + Double.MAX_VALUE);

        //below does not compile literal values by default are known to be double so you have to suffix it with f or F
        //to indicate it is indeed a float
        //float floatNum = 5.25;
        float num = 1.20f;

        //you can also case below
        float caseNum = (float) 1.20;

        int intNum = 5; float floatNum = 5f; double doubleNum = 5d;
        System.out.println(intNum);
        System.out.println(floatNum);
        System.out.println(doubleNum);

        //below will output 2 because it is an int, it cannot return 2.5 because that is a double
        System.out.println(intNum / 2);


        System.out.println(floatNum / 2);
        //OR
        System.out.println(5f / 2f);

        //double and float decimal differences
        //16 decimal places
        System.out.println(5d / 3d);

        //OR System.out.println(5.00 / 3.00);

        //7 decimal places
        System.out.println(5f / 3f);

        //1 pound = 0.45359237kilo
        int poundNum = 5;
        double kiloNum = 0.45359237;
        double result = poundNum * kiloNum;
        System.out.println(result);
    }
}
