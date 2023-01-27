package readingUserInput;

import java.util.Scanner;

public class MinMaxNumberChallenge {

    public static void main(String[] args) {
        readMinMaxNumbersUntilUserStops();
    }

    public static void readMinMaxNumbersUntilUserStops(){
        Scanner scanner = new Scanner(System.in);

        int min = 0, max = 0;
        boolean isFirst = true;

        boolean isDone = false;

        do{

            try{
                if(isFirst){
                    System.out.println("Please enter a valid Whole Integer Number. If you are done, enter any character to exit");
                    min = Integer.parseInt(scanner.nextLine());
                    max = min;
                    isFirst = false;
                }else {
                    System.out.println("Please enter a valid Whole Integer Number. If you are done, enter any character to exit");
                    int tmp = Integer.parseInt(scanner.nextLine());

                    if (tmp < min) {
                        min = tmp;
                    }

                    if (tmp > max) {
                        max = tmp;
                    }
                }

            }catch(Exception e){
                isDone = true;
            }

        }while(!isDone);

        System.out.println("Minimum number entered by user is " + min);
        System.out.println("Minimum number entered by user is " + max);
    }
}
