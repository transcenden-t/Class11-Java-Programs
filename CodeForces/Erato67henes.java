//https://codeforces.com/contest/2195/problem/A
import java.util.*;
public class Erato67henes
{
    public static String check(int ar[],int nn)
    {
        for(int i=0;i<nn;i++)
        {
            if(ar[i]==67)
                return "yes";
        }
        return "no";

    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int ttc=in.nextInt();
        int n;
        int arr[];
        for(int tc=1;tc<=ttc;tc++)
        {
            n=in.nextInt();
            arr = new int[n];
            for(int i=0;i<n;i++)
                arr[i]=in.nextInt();
            System.out.println(check(arr , n));
        }
    }
}