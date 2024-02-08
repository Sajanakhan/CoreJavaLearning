package oops_07th_Jan_2024.inheritance.multilevel;

public class LAB148 {
    public static void main(String[] args){
       // GrandFather g= new GrandFather();
        Father f=new Father();
        Son s=new Son();
        GrandFather g=new Son();
        g.bhk3();
        System.out.println("Son Details");
        s.bhk1();
s.bhk2();
s.bhk3();

System.out.println("Father Details");
f.bhk2();
f.bhk3();
    }


}
