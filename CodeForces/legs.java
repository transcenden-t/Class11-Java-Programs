// https://codeforces.com/problemset/problem/1996/A
import java.util.*;
public class legs
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int tc=in.nextInt();
        while(tc-->0)
        {
            int a =in.nextInt();
            System.out.println(a%4==0 ? a/4 : a/4 +1);
        }
    }
}