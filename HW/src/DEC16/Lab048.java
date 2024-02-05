package src.DEC16;
import java.util.Scanner;

public class Lab048 {
    public static void main(String[] args) {
// even and odd number
        //take input from user
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to find if it is even or odd");
       int a=sc.nextInt();
       if(a%2==1) {
           System.out.println("Odd Number");
       }
           else{
           System.out.println("even Number");}
       }

}
