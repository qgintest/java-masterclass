package exp_stmt_codeBlocks_methods;

public class MethodChallenge {

    public static void main(String[] args) {


        displayHigScorePosition("Tim", calculateHighScorePosition(1500));
        displayHigScorePosition("Peter", calculateHighScorePosition(1000));
        displayHigScorePosition("Jack", calculateHighScorePosition(500));
        displayHigScorePosition("Fred", calculateHighScorePosition(100));
        displayHigScorePosition("Dad", calculateHighScorePosition(25));


    }

    public static void displayHigScorePosition(String playerName, int playerPosition){

        String message = playerName + " manaaged to get into position " + playerPosition + " on the high score list";

        System.out.println(message);
    }

    public static int calculateHighScorePosition(int playerScore){

        int position = 4;

        if(playerScore >= 1000){
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        };
        return position;
    }
}
