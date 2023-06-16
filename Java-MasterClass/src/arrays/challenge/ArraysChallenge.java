package arrays.challenge;

import java.util.Arrays;
import java.util.Random;

public class ArraysChallenge {

    public static void main(String[] args) {
        int[] numbers = new int[5];

        Random random = new Random();
        for(int i = 0; i < numbers.length - 1; i++){
            numbers[i] = random.nextInt(100);
        }
        sortArrays(numbers);
    }

    public static void sortArrays(int[] numbers){


        System.out.println("before sort" + Arrays.toString(numbers));

        int[]newArray = new int[numbers.length];

        Arrays.sort(numbers);

        System.out.println("sort in ascending: " + Arrays.toString(numbers));

        int size=0;

        for(int i =numbers.length-1; i >=0; i--){
            newArray[size] = numbers[i];
            size++;
            //System.out.println(numbers[i]);
        }

        System.out.println("after sort" + Arrays.toString(newArray));
        //System.out.println(numbers[numbers.length-1]);

        //System.out.println(numbers[numbers.length-2]);

        //int[] newArray = new int[numbers.length];

//        for(int i = 0; i <= numbers.length-1; i++){
//            System.out.println(newArray[i]);
//            newArray[i] = numbers[i];
//        }

        //System.out.println("after sort" + Arrays.toString(newArray));
    }
}
