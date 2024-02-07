package oops_06_30Dec;

public class LAB132 {
    public static void main(String[] args) {

        String s1="Sajana"; //stored in string constant pool(SCP)
        String s2=new String("Sajana"); //stored in heap
        System.out.println(s1==s2); // checking reference
        System.out.println(s1.equals(s2));  //checking value



    }
}
