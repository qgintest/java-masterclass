package readingUserInput;

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        int currentYear = 2022;

        try{
            System.out.println(getInputFromConsole(currentYear));
        }catch (NullPointerException e){
            System.out.println(getInputFromScanner(currentYear));
        }
    }

    //this only runes in CLI or terminal session
    public static String getInputFromConsole(int currentYear){

        String name = System.console().readLine("Sup, What's your name? ");

        System.out.println("Hi " + name + ", Thanks for taking the course!");



        boolean isDateValid = false;

        int age = 0;

        do{
            String dateOfBirth = System.console().readLine("What's your birthdate? ");
            System.out.println("Enter a year of birth  >= " + (currentYear - 125) + " and <= " + currentYear);
            age = checkData(currentYear, dateOfBirth);
        }while(isDateValid);



        return "your age is: " + age;
    }

    public static String getInputFromScanner(int currentYear){

        Scanner scanner = new Scanner(System.in);

        System.out.println(("Sup, What's your name? "));

        String name = scanner.nextLine();
        //"Hi " + name + ", Thanks for taking the course!");

        boolean isDateValid = false;

        int age = 0;

        do{
            System.out.println(("What's your birthdate? "));
            System.out.println("Enter a year of birth  >= " + (currentYear - 125) + " and <= " + currentYear);
            String dateOfBirth = scanner.nextLine();

            try{
                age = checkData(currentYear, dateOfBirth);
                isDateValid = age < 0 ? false : true;
            }catch(NumberFormatException e){
                System.out.println(("Characters are not allowed. please try again"));
            }
        }while(!isDateValid);

        return "your age is: " + age;

    }

    public static int checkData(int currentYear, String dateOfBirth){
            int dob = Integer.parseInt(dateOfBirth);
            int minimumYear = currentYear - 125;

            if((dob < minimumYear) || (dob > currentYear)){
                return -1;
            }
            return (currentYear - dob);
    }
}
