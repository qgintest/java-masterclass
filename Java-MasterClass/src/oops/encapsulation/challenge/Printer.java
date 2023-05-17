package oops.encapsulation.challenge;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.pagesPrinted = 0;
        this.tonerLevel = (tonerLevel >=0 && tonerLevel <=100) ? tonerLevel : -1;
        this.duplex = duplex;
    }

    public int addToner(int tonarAmount){

        int n = tonerLevel+=tonarAmount;
        if(n > 100 || n < 0){
            return -1;
        }else{
            return n;
        }
    }

    public int printPages(int pages){

        int jobPages = (duplex) ? (pages / 2) + (pages % 2) : pages;

        pagesPrinted+=jobPages;
        return jobPages;
    }
}
