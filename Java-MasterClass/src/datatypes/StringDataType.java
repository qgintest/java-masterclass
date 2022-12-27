package primitives;

public class StringDataType {

    public static void main(String[] args) {
        //String is not primitive, it is a special class in Java
        String myString = "finally, a string";

        System.out.println("A String: " + myString);

        myString = myString + " and many more";

        System.out.println("A String: " + myString);

        System.out.println("I wish i had: \u00241,000,000");

        String num1 = "1";
        String num2 = "2";
        String result = num1 + num2;

        //below will concat both strings
        System.out.println(result);

        String str1 = "100";
        int str2 = 1;
        //below will also concat
        System.out.println(str1  + str2);

        System.out.println(str2  + str1);




    }
}
