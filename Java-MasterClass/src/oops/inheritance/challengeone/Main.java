package oops.inheritance.challengeone;

public class Main {

    public static void main(String[] args) {

        Employee tim = new Employee("tim", "1988", "2020");

        System.out.println(tim);

        System.out.println("Age: " + tim.getAge());
        System.out.println("Pay: " + tim.collectPay());

        SalariedEmployee bro = new SalariedEmployee("tim", "1978", "2020", 50000);

        System.out.println(bro);

        System.out.println("Age: " + bro.getAge());
        System.out.println("Pay: " + bro.collectPay());

        bro.retire();
        System.out.println("Pension check: " + bro.collectPay());

        HourlyEmployee abe = new HourlyEmployee("abe", "1945", "2020", 45);
        System.out.println(abe);

        System.out.println(abe.getDoublePay());

    }




}
