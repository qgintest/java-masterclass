package datatypes;

public class CharDataType {

    public static void main(String[] args) {
        char myChar = 'D';

        char uniChar = '\u0044';

        char numChar = 68;

        System.out.println(myChar); //Literal character
        System.out.println(uniChar);  //Unicode representation
        System.out.println(numChar);  //Numeric representation

        char mySimpleChar = '?';
        char myUnicodeChar = '\u003F';
        char myDecimalChar = 63;

        System.out.println("My values are: " + mySimpleChar + " " + myUnicodeChar + " " + myDecimalChar);
    }
}
