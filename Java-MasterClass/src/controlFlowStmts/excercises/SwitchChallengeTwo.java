package controlFlowStmts.excercises;

public class SwitchChallengeTwo {

    public static void main(String[] args) {

        printDayOfTheWeek(0);
        printDayOfTheWeek(1);
        printDayOfTheWeek(2);
        printDayOfTheWeek(3);
        printDayOfTheWeek(4);
        printDayOfTheWeek(5);
        printDayOfTheWeek(6);
        printDayOfTheWeek(7);

        System.out.println("--------------");

        printWeekDay(0);
        printWeekDay(1);
        printWeekDay(2);
        printWeekDay(3);
        printWeekDay(4);
        printWeekDay(5);
        printWeekDay(6);
        printWeekDay(7);
    }

    public static void printDayOfTheWeek(int day) {


        String dayOfTheWeekswitch = switch(day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wendesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid Day";
        };

        System.out.println(day + " = " + dayOfTheWeekswitch);
    }

    public static void printWeekDay(int day) {

        String dayOfTheWeek = "Invalid Day";

        if (!(day < 0) && !(day > 6)) {
            if (day == 0) {
                dayOfTheWeek = "Sunday";
            } else if (day == 1) {
                dayOfTheWeek = "Monday";
            } else if (day == 2) {
                dayOfTheWeek = "Tuesday";
            } else if (day == 3) {
                dayOfTheWeek = "Wendesday";
            } else if (day == 4) {
                dayOfTheWeek = "Thursday";
            } else if (day == 5) {
                dayOfTheWeek = "Friday";
            } else {
                dayOfTheWeek = "Saturday";
            }
        }
        System.out.println(day + " = " + dayOfTheWeek);
    }

    public static void printNumberInWord(int number){

        String msg = switch(number){
            case 0  -> "Zero";
            case 1  -> "ONE";
            case 2  -> "TWO";
            case 9  -> "NINE";
            default -> "other";
        };

        System.out.println(msg);
    }
}
