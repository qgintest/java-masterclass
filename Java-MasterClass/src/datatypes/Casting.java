package primitives;

public class Casting {

    public static void main(String[] args) {

        int number = (128572/2);

        //below won't work because a int cannot be assigned to a short so casting is required
        //short shortNum = (128572 / 2);

        short shortNum = (short) (128572 / 2);

        int number2 = (int) (128572.2/2);

    }
}
