package arrays;

import java.util.Arrays;

public class BasicArrays {

    //the below class illustrates how Java's array type is very basic, it comes with very limited built-in functionality
    //it has a single property or field, named length
    //and it inherits java.util.Objects functionality
    //altneraively use java.util.Arrays for more common functionality

    public static void main(String[] args) {
        int[] myIntArray = new int[10]; //fixed, cannot be resized
        myIntArray[0] = 45;
        myIntArray[5] = 50;

        double[] doubleArray = new double[10];
        doubleArray[2] = 3.5;

        System.out.println(doubleArray[2]);

        int[] firstTen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("first = " + firstTen[0]);
        int arrayLength = firstTen.length;
        System.out.println("length of array = " + arrayLength);
        System.out.println("last = " + firstTen[arrayLength - 1]);

        int[] newArray;
        //newArray = new int[]{5, 4, 3, 2, 1};
        newArray = new int[5];
        for(int i = 0; i<newArray.length; i++){
            newArray[i] = newArray.length - i;
        }

        for(int i = 0; i < newArray.length; i++){
            System.out.print(newArray[i] + " ");
        }

        System.out.println();

        //enhanced for loops
        for(int element : newArray){
            System.out.print(element + " ");
        }

        System.out.println();
        //System.out.println(newArray); //will print something like this [I@2f92e0f4
        //                                                              I= primitive integer array followed by hexadecimal representation of the hash code

        System.out.println(Arrays.toString(newArray));

        Object objectVariable = newArray;
        if(objectVariable instanceof int[]){
            System.out.println("objectVariable is really an int array");
        }

        Object[] objectArray = new Object[3];
        objectArray[0] = "Hello";
        objectArray[1] = new StringBuilder("World");
        objectArray[2] = newArray; //nested array
    }
}
