package controlFlowStmts.excercises;

public class WhileChallenge {

    public static void main(String[] args) {

        int startingNumber = 5;
        int endingNumber = 20;
        int evenNumbers = 0;
        int oddNumbers = 0;

        while(startingNumber <= endingNumber){

            if(isEvenNumber(startingNumber)){
                System.out.println(startingNumber + " is an even number");
                evenNumbers++;
            }else{
                oddNumbers++;
            }

            if(evenNumbers == 5){
                break;
            }

            startingNumber++;

            //alternatively you can also use continue keyword to bypass print statement as shown in code below
//            if(isEvenNumber(startingNumber) == false){
//                continue;
//            }
//            System.out.println(startingNumber + " is an even number");
        }

        System.out.println("Total Even numbers: " + evenNumbers);
        System.out.println("Total Odd numbers: " + oddNumbers);

    }

    //determine if argeument being passed is even number or not
    public static boolean isEvenNumber(int number){
        if((number % 2) == 0){
            return true;
        }else{
            return false;
        }
    }
}
