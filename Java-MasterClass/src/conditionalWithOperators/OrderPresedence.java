package conditionalWithOperators;

public class OrderPresedence {

    public static void main(String[] args) {
        double d = 20.00d;
        double d2 = 80.00d;

        double result = d + d2 * 100.00d;
        System.out.println(result);

        double remainder = result % 40.00d;
        System.out.println(remainder);

        boolean isRemainderZero = (remainder == 0) ? true : false;

        System.out.println(isRemainderZero);

        if(!isRemainderZero){
            System.out.println("got some remainder");
        }
    }
}
