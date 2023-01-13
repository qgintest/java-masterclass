package controlFlowStmts.excercises;


/*

Write a method isLeapYear with a parameter of type int named year.

The parameter needs to be greater than or equal to 1 and less than or equal to 9999.

If the parameter is not in that range return false.

Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is, otherwise return false.

A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.

Write another method getDaysInMonth with two parameters month and year.  ​Both of type int.

If parameter month is < 1 or > 12 return -1. ​

If parameter year is < 1 or > 9999 then return -1.

This method needs to return the number of days in the month. Be careful about leap years they have 29 days in month 2 (February).

You should check if the year is a leap year using the method isLeapYear described above.



 */
public class IsLeapYear {

    public static void main(String[] args) {
        //System.out.println(isLeapYear(-1600));  //false
        //System.out.println(isLeapYear(1600));//true
        //System.out.println(isLeapYear(2017)); //false
        //System.out.println(isLeapYear(2000));  //true

        System.out.println(getDaysInMonth(1, 2020)); //31
        System.out.println(getDaysInMonth(2, 2020)); //29 because its a leap year
        System.out.println(getDaysInMonth(2, 2018)); //28 not a leap year
        System.out.println(getDaysInMonth(-1, 2020)); //-1
        System.out.println(getDaysInMonth(1, -2020)); //-1



    }
    public static boolean isLeapYear(int year){
        boolean answer = false;

        if((year >=1) && (year <= 9999)){
            if((year % 4) == 0){
                if((year % 100) == 0){
                    if((year % 400) == 0) {
                        answer = true;
                    }
                }else{
                    answer = true;
                }
            }
        }

        return answer;
    }
    public static int getDaysInMonth(int month, int year){

        int daysInMonth = -1;

        if((!(month < 1) && !(month > 12)) && (!(year < 1) && !(year > 9999))){
            switch(month){
                case 1:
                    daysInMonth = 31;
                    break;
                case 2:

                    if(isLeapYear(year) == true){
                        daysInMonth = 29;
                    }else{
                        daysInMonth = 28;
                    }
                    break;

                case 3:
                    daysInMonth = 31;
                    break;

                case 4:
                    daysInMonth = 30;
                    break;

                case 5:
                    daysInMonth = 31;
                    break;
                case 6:
                    daysInMonth = 30;
                    break;
                case 7:
                    daysInMonth = 31;
                    break;
                case 8:
                    daysInMonth = 31;
                    break;

                case 9:
                    daysInMonth = 30;
                    break;

                case 10:
                    daysInMonth = 31;
                    break;

                case 11:
                    daysInMonth = 30;
                    break;

                case 12:
                    daysInMonth = 31;
                    break;
            }
        }

        return daysInMonth;
    }

}
