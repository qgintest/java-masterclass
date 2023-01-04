package exp_stmt_codeBlocks_methods;

public class Methods {

    public static void main(String[] args) {

        System.out.println("final score is " + calculateScore(true, 800, 5, 100));

        System.out.println("final score is " + calculateScore(true, 10000, 8, 200));
    }

    public static int calculateScore(boolean isGameOver, int score, int levelCompleted, int bonus) {

        int finalScore = score;

        if (isGameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
        }

        return finalScore;
    }
}
