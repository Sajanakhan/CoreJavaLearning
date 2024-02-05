package src.DEC16;

public class Lab038 {
    public static void main(String[] args) {

        //ternary operator
        int  a=40;
        int b=20;
        int c=32;
        int max = (a > b) ? ((a>c)? a:c) : ((b>c) ? b : c);
        //int min = a < b ? a : b ;
        System.out.println(max);
        //System.out.println(min);

    }
}
