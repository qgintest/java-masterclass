package exp_stmt_codeBlocks_methods;

public class SeoncdsAndMinutesChallenge {

    //1 minutes = 60 seconds
    //1 hour = 60 miunutes or 3600 seconds

    public static void main(String[] args) {

        //System.out.println(getDurationString(-5)); //should return invalid message
        //System.out.println(getDurationString(-5, 5)); //should return invalid message
        //System.out.println(getDurationString(5, 60)); //should return invalid
        //System.out.println(getDurationString(200));//should return 0 hours, 3 minutes, and 20 seconds
        //System.out.println(getDurationString(3600)); //should return 1 hour, 0 minutes, 0 seconds
        //System.out.println(getDurationString(4000)); //1 hr, 6 minutes, 40 seconds

        //System.out.println(getDurationString(61)); //0 hour, 1 minute, 1 second

        //same result below
        System.out.println(getDurationString(3945)); //1 hr, 5 minutes, 45 seconds
        System.out.println(getDurationString(65, 45)); //1 hr, 5 minutes, 45 seconds

        //same results below
        //System.out.println(getDurationString(610)); //0 hr, 10 minutes, 10 seconds
        //System.out.println(getDurationString(10, 10)); //0 hr, 10 minutes, 10 seconds


        //System.out.println(getDurationString(100, 59));  //1 hour, 40 min, 59 seconds
    }

    public static String getDurationString(int seconds){
        //int minutes = 0;
        String msg = "Invalid seconds passed. Please pass a number greater than or equal to zero";

        if(seconds >=0){
           // seconds = (seconds % 60);
           // System.out.println("minutes: " + (seconds / 60));
           // System.out.println("remaining seconds: " + (seconds % 60));
            msg = getDurationString((seconds / 60), (seconds % 60));
        }

        return msg;
    }

    public static String getDurationString(int minutes, int seconds){
        int hours = 0;
        if((minutes >=0) && ((seconds >=0) && (seconds <=59))){
            hours = (minutes / 60);
            minutes = (minutes % 60);
            if(minutes >= 60){
                minutes = 0;
            }

        }else{
            return "Invalid minutes or seconds passed. Please pass a minute(s) greater than or equal to zero AND " +
                    "seconds between 0 - 59";
        }

        return hours + " hour(s) " + minutes + " minute(s) " + seconds + " second(s)";
    }
}
