package conditionalWithOperators;

public class Ternary {

    public static void main(String[] args) {

        String brand = "toyota";

        //boolean isDomestic = brand == "toyota" ? false: true;

        boolean isDomestic = (brand != "toyota");


        System.out.println(isDomestic);

        brand = "ford";

        isDomestic = brand == "toyota" ? false: true;

        System.out.println(isDomestic);
    }
}
