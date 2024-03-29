package oops.inheritance.challengeone;

public class HourlyEmployee extends Employee {

    private double hourlyPayRate;

    public HourlyEmployee(String name, String birthDate, String hireDate, double hourlyPayRate) {
        super(name, birthDate, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double getDoublePay(){
        return 2 * collectPay();
    }

    public double collectPay(){
        double payCheck = hourlyPayRate / 80;
        return (int) payCheck;
    }
}
