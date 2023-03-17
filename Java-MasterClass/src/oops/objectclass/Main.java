package oops.objectclass;

public class Main extends Object {

    public static void main(String[] args) {

        Student max = new Student("Max", 21);
        System.out.println(max.toString()); //the toString is not needed because it will get called anyway

        /*
        prints out
        oops.objectclass.Student@36baf30c
                                 hash code of the object
                                 hash code is integer that is unique to an instance in the current executed code
                                 when an instance is created, its assigned a has code that tells us about multiple references
                                 are pointing to a single instance
         */

        PrimarySchoolStudent jimmy = new PrimarySchoolStudent("Jimmy", 8, "Carol");

        System.out.println(jimmy);

    }
}

class Student{
    private String name;
    private int age;

    Student(String name, int age){
      this.name = name;
      this.age = age;
    }

    //the code below gets implicitely called unless it is overwritten
//    @Override
//    public String toString() {
//        return super.toString();
//    }

    //below code overwrites toString method originally set above.
    @Override
    public String toString() {
        return name + " is " + age;
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
    }
}

class PrimarySchoolStudent extends Student{
    private String parentName;

    PrimarySchoolStudent(String name, int age, String parentName){
        super(name, age);
        this.parentName = parentName;
    }

    @Override
    public String toString() {
        return parentName + "'s kid, " + super.toString();
    }
}
