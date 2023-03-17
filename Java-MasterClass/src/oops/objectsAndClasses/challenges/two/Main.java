package oops.objectsAndClasses.challenges.two;

public class Main {

    public static void main(String[] args) {
        Customer customer1 = new Customer();
        System.out.println(customer1.getName());
        System.out.println(customer1.getCreditLimit());
        System.out.println(customer1.getEmailAddress());

        Customer customer2 = new Customer("Mittu", 600, "m@gmail.com");
        System.out.println(customer2.getName());
        System.out.println(customer2.getCreditLimit());
        System.out.println(customer2.getEmailAddress());

        Customer customer3 = new Customer("Drew", "d@gmail.com");
        System.out.println(customer3.getName());
        System.out.println(customer3.getCreditLimit());
        System.out.println(customer3.getEmailAddress());


    }
}
