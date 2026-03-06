import java.util.*;
public class restoring_three_numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long w =in.nextLong();
        long x =in.nextLong();
        long y =in.nextLong();
        long z =in.nextLong();
        long a_b_c = (w+x+y+z)/3;
        if(a_b_c==w) System.out.println((a_b_c-x)+" "+(a_b_c-y)+" "+(a_b_c-z));
        if(a_b_c==x) System.out.println(+(a_b_c-w)+" "+(a_b_c-y)+" "+(a_b_c-z));
        if(a_b_c==y) System.out.println(+(a_b_c-w)+" "+(a_b_c-x)+" "+(a_b_c-z));
        if(a_b_c==z) System.out.println(+(a_b_c-x)+" "+(a_b_c-y)+" "+(a_b_c-w));
    }
}