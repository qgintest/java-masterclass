package readingUserInput;

import java.util.Scanner;

public class InputCalculator {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);

        boolean isNumber = true;
        int numberCount = 0;
        double sum = 0;
        //int previousNumber = 0;
        //int smallestNumber = 0;
        //int largestNumber = 0;
        long average = 0;

        System.out.println("INPUT");

        do{
            try{
                int tmp = Integer.parseInt(scanner.nextLine());

                if(numberCount == 0){
                   // smallestNumber = tmp;
                   // largestNumber = tmp;
                    numberCount++;
                    sum+=tmp;
                }else{
//                    if(tmp < smallestNumber){
//                        smallestNumber = tmp;
//                    }
//
//                    if(tmp > largestNumber){
//                        largestNumber = tmp;
//                    }
                    numberCount++;

                    sum+= tmp;

                    //average = (largestNumber - smallestNumber) / numberCount;
                    average = (long) (sum / numberCount);
                }

            }catch(NumberFormatException n){
                System.out.println("SUM = " + Math.round(sum) + " AVG = " + average);
                //isNumber = false;
            }

        }while(isNumber);

    }
}
