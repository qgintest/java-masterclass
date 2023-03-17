package oops.objectsAndClasses.challenges.four;

public class Point {

           /*
        A
        this.x this.y

        B
        0,0

        d(A,B)=√ (xB − xA)     * (xB -  xA    ) +   (yB − yA)     * (yB - yA)
                 (0  - this.x) * (0   - this.x) +   (0 - this.y)  * (0  - this.y)
         */

    private int x;
    private int y;

    public Point(){

        //below seems to be optional because if its ommitted, java does this implicitely
        this(0,0);
    }

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return this.x;
    }

    public void setX(int x){
        this.x = x;
    }

    public int getY(){
        return this.y;
    }

    public void setY(int y){
        this.y = y;
    }

    public double distance(){
        return  distance(0,0);
    }

    public double distance(int x, int y){
        return Math.sqrt((x  - this.x) * (x   - this.x) + (y - this.y)  * (y  - this.y));
    }

    public double distance(Point another){
        return  Math.sqrt((another.getX()  - this.x) * (another.getX()   - this.x) +   (another.getY() - this.y)  * (another.getY()  - this.y));
    }

}
