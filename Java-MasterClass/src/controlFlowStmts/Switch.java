package controlFlowStmts;

public class Switch {

    public static void main(String[] args) {
        int value = 1;

//        if (value == 1) {
//            System.out.println("1");
//        } else if (value == 2) {
//            System.out.println("2");
//        } else {
//            System.out.println("something else");
//        }

        switch (value) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3: case 4: case 5:
                System.out.println("3, 4 or 5");
                break;
            default:
                System.out.println("something else");
                break;
        }

        //as of java 14, no fall through will happen
        switch (value) {
            case 1 -> System.out.println("1");
            case 2 -> System.out.println("2");
            case 3, 4, 5 -> System.out.println("3, 4 or 5");
            default -> System.out.println("something else");
        }

        System.out.println(getQuarter("March"));

    }

    public static String getQuarter(String month){

        //enhanced switch expression
        return switch (month){
            case "January", "Feburary", "March" -> "1st";
            case "April", "May", "June" -> "2nd";
            case "July", "August", "September" -> "3rd";
            default -> {
                String badResponse = month + " bad response";
                yield badResponse;
            }
        };
    }
}
