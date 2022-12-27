package datatypes;

public class PrimitiveTypeChallenge {
    public static void main(String[] args) {

        byte byteNum = 1;
        short shortNum = 10;
        int intNum = 100;

        long longNum = 50_000L + 10L * (byteNum + shortNum + intNum);

        System.out.println(longNum);
    }
}
