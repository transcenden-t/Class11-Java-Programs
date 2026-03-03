import java.util.*;
public class False_alarm
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int tc=in.nextInt();
        int n,x;
        while(tc-->0)
        {
            n=in.nextInt();
            int arr[] = new int[n];
            x=in.nextInt();
            int ci=0,cf=0;
            for(int i=0;i<n;i++) arr[i]=in.nextInt();
            for(int i=0;i<n;i++) { if(arr[i]==1) {ci=i; break; } }
            for(int i=n-1;i>=0;i--) { if(arr[i]==1) {cf=i; break; } }
            System.out.println((cf-ci+1<=x) ? "Yes" : "No");
        }
    }
}