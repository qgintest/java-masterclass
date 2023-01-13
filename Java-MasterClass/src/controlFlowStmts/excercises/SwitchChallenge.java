package controlFlowStmts.excercises;

public class SwitchChallenge {

    public static void main(String[] args) {

        //printNatoWordTraditionalSwitch('A');
        //printNatoWordTraditionalSwitch('E');
        //printNatoWordTraditionalSwitch('?');

        printNatoWordEnhanced('A');
        printNatoWordEnhanced('b');

        System.out.println(returnNatoWordEnhanced('A'));
        System.out.println(returnNatoWordEnhanced('C'));

    }

    public static String returnNatoWordEnhanced(char letter){
        return switch (letter) {
            case 'A' -> letter + " = Able";

            case 'B', 'b' -> letter + " = Baker";

            case 'C' -> {
                String str = String.valueOf(letter);
                yield str;
            }

            default -> letter + " cannot be found";
        };
    }
    public static void printNatoWordEnhanced(char letter){
        switch (letter) {
            case 'A' -> System.out.println(letter + " = Able");

            case 'B', 'b' -> System.out.println(letter + " = Baker");

            case 'C' -> {
                System.out.println(letter + " = Charlie");
                System.out.println(letter + " = Charlie");
            }
        }
    }
    public static void printNatoWordTraditionalSwitch(char letter){
        switch (letter) {
            case 'A':
                System.out.println(letter + " = Able");
                break;

            case 'B':
                System.out.println(letter + " = Baker");
                break;

            case 'C':
                System.out.println(letter + " = Charlie");
                break;

            case 'D':
                System.out.println(letter + " = Dog");
                break;

            case 'E':
                System.out.println(letter + " = Easy");
                break;

            default:
                System.out.println(letter + " = Cannot be found");
                break;
        }
    }
}
