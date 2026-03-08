import java.util.*;
public class heapify
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int tc=in.nextInt();
        while(tc-->0)
        {
            int n=in.nextInt();
            boolean isheap=true;
            int arr[]= new int[n+1];
            for(int i=1;i<=n;i++) arr[i]=in.nextInt();
            int val,pos;
            for(int i=1;i<=n;i++)
            {
                if(i!=arr[i])
                {
                    val = arr[i];
                    pos = i;
                    if(val>=pos)
                    {
                        while(pos<val) pos*=2;
                    }  
                    else
                    {
                        while(pos>val) pos/=2;
                    }
                    if(pos!=val) {isheap=false; break;}
                }
            }
            System.out.println(isheap ? "YES" : "NO");
        }
    }
}