package oops.objectsAndClasses.challenges.one;

public class ClassesChallenge {

    public static void main(String[] args) {
        BankAccount AbeBankAccount = new BankAccount();

        AbeBankAccount.setFunds(100);
        AbeBankAccount.setFunds(100);

        AbeBankAccount.setFunds(500);

        AbeBankAccount.getFunds(250);

        AbeBankAccount.getFunds(500);

        System.out.println("----------");

        BankAccount MittuBankAccount = new BankAccount();
        MittuBankAccount.setFunds(5678.50);

        MittuBankAccount.getFunds(999.67);

    }
}
