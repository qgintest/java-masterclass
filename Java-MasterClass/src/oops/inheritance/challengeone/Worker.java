package oops.inheritance.challengeone;



public class Worker {

    private String name;
    private String birthDate;
    protected String endDate;

    public Worker(){

    }

    Worker(String name, String birthDate){
        this.name = name;
        this.birthDate = birthDate;
    }


    public int getAge(){
        return (Integer.parseInt("2023")) - (Integer.parseInt(this.birthDate));
    }

    public double collectPay(){
        return 0.0;
    }

    public void terminate(String endDate){
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
