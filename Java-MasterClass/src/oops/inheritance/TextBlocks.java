package oops.inheritance;

public class TextBlocks {

    public static void main(String[] args) {

        //pre-jdk15
        String bulletList = "Print a bullet list: \n" +
                "\t\u2022 First Point\n" +
                "\t\t\u2022 Second Point";

        System.out.println(bulletList);

        //jdk15+
        String textBlock = """
                            
                            Print a Bulleted list: 
                            \u2022 First Point
                                \u2022 Second Point
                            """;

        System.out.println(textBlock);

        int age = 35;
        System.out.printf("your age is %d\n", age);

        int yearOfBirth = 2023 - age;
        System.out.printf("Age = %d, Birth year = %d", age, yearOfBirth);


        System.out.printf("your age is %f\n", (float) age);

        //two decimal places
        System.out.printf("your age is %.2f\n", (float) age);

        for(int i = 1; i <=100000; i*=10){
            System.out.printf("printing %6d %n", i);
        }

        String formattedString = String.format("your age is %d", age);
        System.out.println(formattedString);

        formattedString = "your age is %d".formatted(age);
        System.out.println(formattedString);


    }
}
