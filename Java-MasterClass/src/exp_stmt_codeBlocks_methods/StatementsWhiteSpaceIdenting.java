package exp_stmt_codeBlocks_methods;

public class StatementsWhiteSpaceIdenting {

    public static void main(String[] args) {

        //entire line is a statement
        int myVar = 50;

        //stmt
        myVar++;

        //stmt
        myVar--;

        //multi-line stmt
        System.out.println("This\n" +
                "is\n" +
                "a\n" +
                "statement\n");

        //white space ignored by java but doesn't look good so don't do this
        int        extraSpace         =       0;
    }
}
