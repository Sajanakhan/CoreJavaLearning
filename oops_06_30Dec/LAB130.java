package oops_06_30Dec;

public class LAB130 {
    public static void main(String[] args) {
        String name="Sajana"; //String constant pool
        String name2= new String("Sajana");// Heap area
       // name="Riyaz";
        System.out.println(name);
        System.out.println(name2);

        String str1="Hello";
        str1=str1.concat(" Sajana"); //Concat function
        System.out.println(str1);



    }
}
