//dynamic function where recursion starts from(1,1)
import java.util.*;
public class recursive_pattern03 {
    static int r;
    static void rec(int i, int j)
    {
        if(i>r) {
        } else if(j>i) {
            System.out.println();
            rec(i+1,1);
        }
        else
        {
            System.out.print(j);
            rec(i,j+1);
        }
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        r = in.nextInt();
        rec(1,1);
    }
}
