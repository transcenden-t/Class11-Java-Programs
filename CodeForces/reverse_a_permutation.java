import java.util.*;
public class reverse_a_permutation
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int tc=in.nextInt();
        while(tc-->0)
        {
            boolean what=true;
            int max=0,m,maxindex=0;
            int n=in.nextInt();
            int nn=n;
            int arr[]=new int[n];
            for(int i=0;i<n;i++) arr[i]=in.nextInt();
            for(int i=0;i<nn;i++)
            {
                if(n==arr[i]) System.out.print(arr[i]+" ");
                else
                {
                    what=false;
                    for(m=i;m<nn;m++) 
                    {
                        if(max<arr[m]) {maxindex=m; max=arr[m];}
                    }
                    for(int j=maxindex;j>=i;j--) System.out.print(arr[j]+" ");
                    break;
                }
                n=n-1;
            }
            if(maxindex!=nn && what==false)
            {
                for(int i=maxindex+1;i<nn;i++) System.out.print(arr[i]+" ");
            }
            System.out.println();   
        }
    }
}