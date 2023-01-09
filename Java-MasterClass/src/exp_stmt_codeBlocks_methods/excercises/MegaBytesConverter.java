package exp_stmt_codeBlocks_methods.excercises;


//        MegaBytes Converter
//        Write a method called printMegaBytesAndKiloBytes that has 1 parameter of type int with the name kiloBytes.
//
//        The method should not return anything (void) and it needs to calculate the megabytes and remaining kilobytes from the kilobytes parameter.
//
//        Then it needs to print a message in the format "XX KB = YY MB and ZZ KB".
//
//        XX represents the original value kiloBytes.
//        YY represents the calculated megabytes.
//        ZZ represents the calculated remaining kilobytes.
//
//        For example, when the parameter kiloBytes is 2500 it needs to print "2500 KB = 2 MB and 452 KB"
//
//        If the parameter kiloBytes is less than 0 then print the text "Invalid Value".

//        TIP: 1 MB = 1024 KB


public class MegaBytesConverter {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        int megaBytes = 0;
        int remainingKilobytes = 0;

        String msg = "Invalid Value";

        if(!(kiloBytes < 0)){
            megaBytes = (kiloBytes / 1024);
            remainingKilobytes = (kiloBytes % 1024);
            msg = kiloBytes + " KB = " + megaBytes + " MB and " + remainingKilobytes + " KB";
        }

        System.out.println(msg);


    }
}
