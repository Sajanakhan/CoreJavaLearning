package oops_07th_Jan_2024;

public class Person {
    String name;
    Person(){    //Default constructor
        System.out.println("Default constructor");
            }
   Person(String ref_name){
        this.name=ref_name;
}
    Person(String ref_name,String age){
        this.name = ref_name;
    }

    Person(String ref_name,String age, int rollNo){
        this.name = ref_name;
    }

    void printDetail(){
        System.out.println("Your Name is -> " + this.name);
    }

    void printDetail(String name){
        System.out.println("Your Name is -> " + this.name);
    }

    int printDetail(int a){
        System.out.println("Your Name is -> " + this.name);
        return 99;
    }


}
