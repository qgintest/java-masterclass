package controlFlowStmts;

public class WhileLoop {

    public static void main(String[] args) {

        for(int i = 0; i <=5; i++){
            System.out.println(i);
        }

        int z = 0;

        while(z <= 5){
            System.out.println(z);
            z++;
        }

        int j = 0;

        //prints 6 times because first print happens before incrementor
        do{
            System.out.println("print");
            j++;
        }while(j <=5);
    }
}
