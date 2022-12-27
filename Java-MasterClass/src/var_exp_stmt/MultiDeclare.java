package var_exp_stmt;

public class MultiDeclare {

    public static void main(String[] args) {
        byte a = 1;

        byte b = 2, c = 3;

        //below e cannot be resolved because its a new statement
        //byte d = 4; e = 5;

        //below cannot be done because they are of different types. need ; to clsoe statement
        //int num1 = 0, double num2 = 1.2;

        //below is allowed because they are of same data type
        int num1 = 0, num2 = 2;

        System.out.println(a+ b+ c);
        System.out.println(num2);
    }
}
