import java.util.*;
public class Recursive_pattern02 {
    static void rec(int r, int a)
    {
        if(r>a)
            return;
        System.out.println(r);
        rec(r+1,a);
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        Recursive_pattern02.rec(1,a);
    }
    
}
