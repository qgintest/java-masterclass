package exp_stmt_codeBlocks_methods.excercises;

public class AreaCalculator {

    public static void main(String[] args) {
        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1.0, 4.0));
    }

    public static double area(double radius){

        double areaOfCircle = -1.0;

        if(!(radius < 0)){
            areaOfCircle = (radius * radius) * Math.PI;
        }


        //area of a circle
        return (double) areaOfCircle;
    }

    public static double area(double x, double y){

        double areaOfRectangle = -1.0;

        if(!(x < 0) && !(y < 0)){
            areaOfRectangle = (x * y);
        }


        //area of a rectangle
        return (double) areaOfRectangle;
    }
}
