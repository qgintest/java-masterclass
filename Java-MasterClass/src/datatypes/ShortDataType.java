package primitives;

public class ShortDataType {

    public static void main(String[] args) {
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);

        System.out.println(Short.SIZE);

        //below will not compile because value is bigger than max value for short
        //short BigShort = 32768;
    }
}
