import java.util.*;
public class heapify
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int tc=in.nextInt();
        while(tc-->0)
        {
            int e,root=0;
            int n = in.nextInt();
            int arr[] = new int[n+1];
            for(int i=1;i<=n;i++) arr[i]=in.nextInt();
            boolean[] this_i_checked = new boolean[n+1];
            boolean ispossible=true;
            for(int i=1;i<=n;i++)
            {
                if(!this_i_checked[i])
                {
                    root=i;
                    while(root%2==0) root/=2;
                    e = 0;
                    for (int j = root; j <= n; j *= 2) e++;
                    int ind[] = new int[e];
                    int val[] = new int[e];
                    int idx=0;
                    for (int j = root; j <= n; j *= 2) {
                        ind[idx] = j;
                        val[idx] = arr[j];
                        this_i_checked[j] = true;
                        idx++;
                    }
                    Arrays.sort(ind);
                    Arrays.sort(val);
                    if(!Arrays.equals(ind,val))
                    {
                        ispossible=false;
                        break;
                    }
                }
            }
            System.out.println(ispossible ? "YES" : "NO");
        }
    }
}