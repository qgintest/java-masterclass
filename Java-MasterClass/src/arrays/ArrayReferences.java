package arrays;

import java.util.Arrays;

public class ArrayReferences {

    public static void main(String[] args) {
        int[] myIntArray = new int[5];

        int[] anotherArray = myIntArray;

        System.out.println(Arrays.toString(myIntArray));
        System.out.println(Arrays.toString(anotherArray));

    }
}
