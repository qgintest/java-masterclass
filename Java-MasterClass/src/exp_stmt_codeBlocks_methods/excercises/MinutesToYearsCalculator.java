package exp_stmt_codeBlocks_methods.excercises;

public class MinutesToYearsCalculator {

    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
        printYearsAndDays(-1);

    }

    public static void printYearsAndDays(long minutes){

        String msg = "Invalid Value";

        if(!(minutes < 0)){
            long hours = (minutes / 60);
            long days = (hours / 24);
            long years = (days / 365);
            days = (days % 365);

            msg = minutes + " min = " + years +  " y and " + days + " d";
        }

        System.out.println(msg);

    }
}
