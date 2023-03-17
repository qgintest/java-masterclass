package strings;

public class StringCompairson {

    public static void main(String[] args) {

        String str = "SomeStringOfIt";
        String strLowerCase = "SomeStringOfIt".toLowerCase();

        if(str.equals(strLowerCase)){
            System.out.println("Match");
        }

        if(str.contentEquals(str)){
            System.out.println("Content Match");
        }

        if(str.equalsIgnoreCase(strLowerCase)){
            System.out.println("Match");
        }

        if(str.startsWith("Some")){
            System.out.println("Starts with hello");
        }
    }
}
