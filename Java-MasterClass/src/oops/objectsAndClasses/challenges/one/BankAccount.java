package oops.objectsAndClasses.challenges.one;

public class BankAccount {


    private long accountNumber = 123456789;

    private double accountBalance = 0.0;

    private String customerName = "Abe";

    private String email = "abe@gmail.com";

    private String phoneNumber = "111-222-4444";


    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getFunds(double amount){
        System.out.println("Request to withdraw: " + amount + " has been sent");
        if((getAccountBalance() - amount) <0){
            System.out.println("Unable to Withdraw since your current balance of " + getAccountBalance() + " is less" +
                    " than the requested amount of " + amount);
            return 0.0;
        }else{
            setAccountBalance((getAccountBalance() - amount));
            System.out.println("Remaining balance is: " + getAccountBalance());
            return amount;
        }

    }

    public void setFunds(double amount){
        System.out.println("Thank you for your deposit of " + amount);
        setAccountBalance(getAccountBalance() + amount);
        System.out.println("New Balance is now " + getAccountBalance());
    }

}
