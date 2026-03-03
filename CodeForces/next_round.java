import java.util.*;
public class next_round
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int num=0;
        int[] arr = new int[n];
        for(int i =0;i<n;i++) arr[i]=in.nextInt();
        for(int i=0;i<n;i++) 
        {
            if(arr[i]>0 && arr[i]>=arr[k-1]) num++;
        }
        System.out.println(num);
    }
}