package oops.objectsAndClasses.challenges.two;

public class Customer {

    String name;

    int creditLimit;

    String emailAddress;

    public String getName() {
        return name;
    }

    public Customer(){
        this("Abe", 700, "ae@gmail.com");
    }

    public Customer(String name, String emailAddress){
        this(name, 700, emailAddress);
    }

    public Customer(String name, int creditLimit, String emailAddress){
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
