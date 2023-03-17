package exp_stmt_codeBlocks_methods.excercises;

public class PaintProgram {

    public static void main(String[] args) {
        //System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));  //3
        //System.out.println(getBucketCount(-3.4, 2.1, 1.5, 2)); //-1
        //System.out.println(getBucketCount(2.75, 3.25, 2.5, 1)); //3

        //System.out.println(getBucketCount(-3.4, 2.1, 1.5)); //-1
        //System.out.println(getBucketCount(3.4, 2.1, 1.5)); //5
        //System.out.println(getBucketCount(7.25, 4.3, 2.35)); //14

        System.out.println(getBucketCount(3.4, 1.5)); //3
        System.out.println(getBucketCount(6.26, 2.2)); //3
        System.out.println(getBucketCount(3.26, 0.75)); //5

    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){

        double tmp = 0;
        int numberOfBuckets = 0;

        if((width <=0 || height <=0 || areaPerBucket<=0) || extraBuckets <0){
            return -1;
        }

        //1 bucket = 1.5area
        //(total area of Wall / areaPerBucket) - extraBuckets()
        tmp = (((width * height) / areaPerBucket) - extraBuckets);
        numberOfBuckets = (int) Math.ceil(tmp);

        return numberOfBuckets;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket){

        double tmp = 0;
        int numberOfBuckets = 0;

        if((width <=0 || height <=0 || areaPerBucket<=0)){
            return -1;
        }

        //1 bucket = 1.5area
        //(total area of Wall / areaPerBucket) - extraBuckets()
        tmp = ((width * height) / areaPerBucket);
        numberOfBuckets = (int) Math.ceil(tmp);

        return numberOfBuckets;
    }

    public static int getBucketCount(double area, double areaOfBucket){

        double tmp = 0;
        int numberOfBuckets = 0;

        if((area <=0 || areaOfBucket <=0)){
            return -1;
        }

        //1 bucket = 1.5area
        //(total area of Wall / areaPerBucket) - extraBuckets()
        tmp = (area / areaOfBucket);
        numberOfBuckets = (int) Math.ceil(tmp);

        return numberOfBuckets;
    }
}
