package oops.inheritance.challengeone;

public class Employee extends Worker{

    private long employeeId;

    private static int employeeNo = 1;
    private String hireDate;


    Employee(String name, String birthDate, String hireDate){
        super(name, birthDate);
        this.employeeId = Employee.employeeNo++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}
