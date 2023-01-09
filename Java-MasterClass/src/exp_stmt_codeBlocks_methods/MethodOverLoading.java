package exp_stmt_codeBlocks_methods;

public class MethodOverLoading {

    public static void main(String[] args) {
        System.out.println(calculateScore("Abe", 5));
        System.out.println(calculateScore(7));
        System.out.println(calculateScore());
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score){
        System.out.println("Unnamed Player  scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(){
        System.out.println("No Player  no Score");
        return 0;
    }
}
