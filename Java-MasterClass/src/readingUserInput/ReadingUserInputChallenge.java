package readingUserInput;

import java.util.Scanner;

public class ReadingUserInputChallenge {

    public static void main(String[] args) {
        readFromUserInput();
    }

    public static void readFromUserInput(){

        Scanner scanner = new Scanner(System.in);

        int number = 1;
        boolean isDone = false;
        int sum = 0;


        do{
            System.out.println("Enter Number:" + number);

            int userInputNumber = 0;
            try{
                userInputNumber = validateNumber(scanner.nextLine());
            }catch(NumberFormatException e){
                System.out.println("Please enter Integers only. No characters are allowed");
                continue;
            }

            if(userInputNumber == -1){
                System.out.println("Please enter a valid positive Integer greater than zero");
            }else{
                number++;
                sum+= userInputNumber;
            }

            if(number > 5) {
                isDone = true;
            }
        }while(!isDone);

        System.out.println("Sum of all 5 numbers equals: " + sum);

    }

    public static int validateNumber(String input){
        int number = Integer.parseInt(input);

        //checks non-negative numbers
        if(number < 0){
            return -1;
        }

        return number;
    }
}
