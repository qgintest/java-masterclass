package oops.composition.product;

public class Main {

    public static void main(String[] args) {
        ComputerCase computerCase = new ComputerCase("2208", "Dell", "240");

        Monitor monitor = new Monitor("32 inch God", "Acer", 27, "2540 X 1440");

        MotherBoard motherBoard = new MotherBoard("BJ-200", "Asus", 4, 6, "v2.44");

        PersonalComputer pc = new PersonalComputer("2208", "Dell", computerCase, monitor, motherBoard);

        pc.powerUp();
//        pc.getMonitor().drawPixelAt(10, 10, "red");
//        pc.getMotherBoard().loadingProgram("Windows OS");
//        pc.getComputerCase().pressPowerButton();
    }
}
