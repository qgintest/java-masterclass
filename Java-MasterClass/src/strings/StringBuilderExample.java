package strings;

public class StringBuilderExample {

    public static void main(String[] args) {

        String str = "Hello" + "World";
        str.concat(" And GoodBye"); //an object in memory is created. but because it wasn't assigned to a variable, the old reference is still being used so length has not changed

        StringBuilder strBuilder = new StringBuilder("Hello" + "World");
        strBuilder.append(" And Goodbuye");

        printInformation(str);
        printInformation(strBuilder);

        StringBuilder emptyStart = new StringBuilder();  //default capacity of 16 (characters) before requesting more memory
        emptyStart.append("a".repeat(17));

        StringBuilder emptyStart32 = new StringBuilder(32);
        emptyStart32.append("a".repeat(17));

        printInformation(emptyStart);
        printInformation(emptyStart32);

        StringBuilder builderPlus = new StringBuilder("Hello" + "World");
        builderPlus.append(" And Goodbye");

        builderPlus.deleteCharAt(15).insert(15, 'g');

        printInformation(builderPlus);

        builderPlus.replace(15, 16, "G");

        printInformation(builderPlus);

        builderPlus.reverse().setLength(7);

        printInformation(builderPlus);

    }

    public static void printInformation(String str){
        System.out.println("String = " + str);
        System.out.println("Length = " + str.length());
    }

    public static void printInformation(StringBuilder builder){
        System.out.println("String = " + builder);
        System.out.println("Length = " + builder.length());
        System.out.println("Capacity: " + builder.capacity());
    }
}
