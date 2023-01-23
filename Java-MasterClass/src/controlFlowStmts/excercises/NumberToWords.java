package controlFlowStmts.excercises;

public class NumberToWords {

    public static void main(String[] args) {
        //numberToWords(234);
        //numberToWords(001);
        numberToWords(100);

    }

    public static void numberToWords(int number){
        if (number < 0) {
            System.out.println("Invalid Value");
        }

        int reverseNumber = reverse(number);

            for (int i = 0; i < getDigitCount(number); i++){

            switch(reverseNumber % 10){
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;

                case 2:
                    System.out.println("Two");
                    break;

                case 3:
                    System.out.println("Three");
                    break;

                case 4:
                    System.out.println("Four");
                    break;

                case 5:
                    System.out.println("Five");
                    break;

                case 6:
                    System.out.println("Six");
                    break;

                case 7:
                    System.out.println("Seven");
                    break;

                case 8:
                    System.out.println("Eight");
                    break;

                case 9:
                    System.out.println("Nine");
                    break;
            }

            reverseNumber/= 10;
        }


    }

    public static int reverse(int number){

        int tmp = 0;

        for(int i = number; i!=0; i/=10) {
            tmp = (tmp * 10) + (i % 10);
        }
        return tmp;
    }

    public static int getDigitCount(int number) {

        if (number < 0) {
            return -1;
        }

        int counter = 1;
        while (number > 9) {
            number /= 10;
            counter++;
        }
        return counter;
    }
}
