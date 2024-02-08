package oops_07th_Jan_2024.inheritance;

public class LAB146 {
  public static void main (String[] args) {

      Programming p = new Programming(); //Parent class

     /* How JVM understand this..
      Programming ---- Class
          p------Object reference
              new Programming() ----Object
          Default constructor is called*/

      Programming p2 = new Programming("Perl ", 2);

 /* How JVM understand this..
      Programming ---- Class---Class loader
          p2------Object reference
              new Programming() ----Object
          parameterised constructor is called*/

      p2.printInfo();


  }
}
