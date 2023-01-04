package exp_stmt_codeBlocks_methods;

public class ifThen {

    public static void main(String[] args) {
        boolean isGameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = score;

        if(isGameOver){
            finalScore += (levelCompleted * bonus);
            System.out.println("final score is " + finalScore);
        }

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        finalScore = score;

        if(isGameOver){
            finalScore += (levelCompleted * bonus);
            System.out.println("final score is " + finalScore);
        }

//        if(score <= 5000){
//            System.out.println("score is  less than 5000");
//        }else if(score > 500){
//            System.out.println("score is novice level");
//        }else{
//            System.out.println("beginner");
//        }
    }
}
