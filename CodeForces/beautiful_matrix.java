import java.util.*;
public class beautiful_matrix
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int arr[][]= new int[5][5];
        int ii=0,jj=0;
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                arr[i][j]=in.nextInt();
                if(arr[i][j]==1)
                {
                    ii=i;
                    jj=j;
                }
            }
        }
        System.out.print(Math.abs(ii-2)+Math.abs(jj-2));
    }
}