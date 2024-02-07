package oops_06_30Dec;

public class LAB131 {
    public static void main(String[] args) {

        String name="Sajana";    //String constant pool

        System.out.println(name.concat(" Riyaz"));
        System.out.println(name + " Riyaz");
        System.out.println(name.contains("y"));
        System.out.println(name);

        String str1="Sajana";
        String str2="SAJANA";
        String str3="Khan";
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.equalsIgnoreCase(str3));



    }
}
