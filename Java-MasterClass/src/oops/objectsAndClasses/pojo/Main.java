package oops.objectsAndClasses.pojo;

public class Main {

    public static void main(String[] args) {

        for(int i = 1; i <=5; i++){
            Student s = new Student("S9230" + i,
             switch(i){
                case 1 -> "Abe";
                case 2 -> "Brah";
                case 3 -> "Yeah";
                case 4 -> "Juice";
                case 5 -> "Dog";
                default -> "Anonymous";
             },
              "042388",
              "junior");

            System.out.println(s);
        }



    }


}
