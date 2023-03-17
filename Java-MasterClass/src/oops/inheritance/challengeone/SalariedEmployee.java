package oops.inheritance.challengeone;

public class SalariedEmployee  extends Employee{

    private double annualSalary;

    private boolean isRetired;

    SalariedEmployee(String name, String birthDate, String hireDate,
                     double annualSalary){
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
    }

    public double collectPay(){
        double payCheck = annualSalary / 26;
        double adjusted = (isRetired) ? 0.90 * payCheck : payCheck;
        return (int) adjusted;
    }

    public void retire()
    {
        terminate("2023");
        isRetired = true;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                ", isRetired=" + isRetired +
                "} " + super.toString();
    }
}
