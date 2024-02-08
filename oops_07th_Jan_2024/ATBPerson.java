package oops_07th_Jan_2024;

public class ATBPerson {
    String name;  // instance  variable values are default
    long phone;
    String email;
    boolean isMarried;
    String courseName;

    //Default constructor
    ATBPerson()
    {
        courseName="ATB";
        System.out.println("I am default");

    }
//Parameterised Constructor
    ATBPerson(String valueFromObjectRef){
        this.name=valueFromObjectRef;
    }

    void talk(){
        System.out.println("Talk");

    }
void printDetails()
{
    System.out.println(this.name);
    System.out.println(courseName);
}
}
