package exp_stmt_codeBlocks_methods.excercises;

public class PlayingCat {

    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 10)); //should return false since temperature is not in range 25 - 45
        System.out.println(isCatPlaying(false, 36)); //should return false since temperature is not in range 25 - 35 (summer parameter is false)
        System.out.println(isCatPlaying(false, 35)); //should return true since temperature is in range 25 - 35
    }

    public static boolean isCatPlaying(boolean summer, int temperature){

        boolean isPlaying = false;

        if(summer && ((temperature >= 25) && (temperature <= 45))){
            isPlaying = true;
        }else{

            if((temperature >= 25) && (temperature <= 35)){
                isPlaying = true;
            }
        }

        return isPlaying;

    }
}
