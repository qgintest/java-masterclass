package oops.encapsulation.challenge;

public class Main {

    public static void main(String[] args) {
        Printer epson = new Printer(50, true);
        System.out.println(epson.addToner(60));

        System.out.println(epson.printPages(5));
        System.out.println(epson.printPages(4));



    }


}
