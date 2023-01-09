package exp_stmt_codeBlocks_methods.excercises;

//12 inches = 1 foot
// 1inch = 2.54cm


public class MethodOverLoadChallenge {

    public static void main(String[] args) {

        System.out.println(convertToCentimeters(12));
        System.out.println(convertToCentimeters(6, 3));
        System.out.println(convertToCentimeters(6, 0));

    }

    public static double convertToCentimeters(int heightInInches){
        return (double) (heightInInches * 2.54);
    }

    public static double convertToCentimeters(int heightInFeet, int heightInInches){
        return (double) convertToCentimeters(heightInInches + (heightInFeet * 12));
    }
}
