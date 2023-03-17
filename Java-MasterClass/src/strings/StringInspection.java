package strings;

import java.util.Locale;

public class StringInspection {

    public static void main(String[] args) {
        printInformation("A somewhat Long String!!");
        printInformation("");
        printInformation("\t    \n");

        String helloWorld = "Hello World";
        System.out.printf("index of r = %d %n", helloWorld.indexOf('r'));
        System.out.printf("index of World = %d %n", helloWorld.indexOf("World"));

        System.out.printf("index of l = %d %n", helloWorld.indexOf("l"));
        System.out.printf("Last index of l = %d %n", helloWorld.lastIndexOf("l"));

        System.out.printf("index of l = %d %n", helloWorld.indexOf("l", 3)); //searches forward starting from index 3
        System.out.printf("Last index of l = %d %n", helloWorld.lastIndexOf("l", 8)); //searches backward starting from index 8


    }

    public static void printInformation(String str) {

        int length = str.length();
        System.out.printf("Length = %d %n", length);

        if (str.isEmpty()) {
            System.out.println("String is empty");
            return;
        }

        if (str.isBlank()) {
            System.out.println("String is blank");
        }

        System.out.printf("First char = %c %n", str.charAt(0));
        System.out.printf("Last char = %c %n", str.charAt(length - 1));


    }
}
