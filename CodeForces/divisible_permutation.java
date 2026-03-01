import java.util.*;
public class divisible_permutation
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int tc=in.nextInt();
        int n;
        while(tc-->0)
        {
            n=in.nextInt();
            int arr[]=new int[n];
            arr[n-1]=1;
            arr[n-2]=n;
            int min =2;
            int max=n-1;
            for(int i=n-3;i>=0;i--)
            {
                if((n-i)%2!=0)
                {
                    arr[i]=min;
                    min++;
                }
                else 
                {
                    arr[i]=max;
                    max--;
                }
            }
            for(int i=0;i<n;i++) System.out.print(arr[i]+" ");
        }
    }
}