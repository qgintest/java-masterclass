package strings;

public class StringManipulation {

    public static void main(String[] args) {

        String birthDate = "04/23/1988";

        int startingIndex = birthDate.indexOf("1988");
        System.out.println("Starting Index: " + startingIndex);
        System.out.println("Birth Year = " + birthDate.substring(startingIndex));

        System.out.println("Month = " + birthDate.substring(0, 2));
        System.out.println("Day = " + birthDate.substring(3, 5));

        String newDate = String.join("/", "08", "03", "1989");
        System.out.println(newDate);

        newDate = "2019";
        newDate = newDate.concat("/");
        newDate = newDate.concat("08");
        newDate = newDate.concat("/");
        newDate = newDate.concat("03");

        System.out.println(newDate);

        newDate = "2019" + "/" + "06" + "/" + "12";
        System.out.println(newDate);

        //nmethod chaining
        newDate = "1988".concat("/").concat("06").concat("/").concat("12");
        System.out.println(newDate);

        System.out.println(newDate.replace("/", "-"));

        System.out.println(newDate.replace("2", "00"));

        System.out.println(newDate.replaceFirst("/", "-"));

        System.out.println(newDate.replaceAll("/", "-"));

        System.out.println("ABC\n".repeat(3).indent(8));
        System.out.println("-".repeat(20));



    }
}
