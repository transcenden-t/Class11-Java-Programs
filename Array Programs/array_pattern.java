/*Write a program in java to enter three distinct characters from user and enter row of a square matrix and print the following pattern example:
#
@
$
4
output:
#@@#
@$$@
@$$@
#@@# */
import java.util.*;
public class array_pattern {
    public static void print(char c1,char c2,char c3, int n)
    {
        char arr[][] = new char[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if((i==0 || i==n-1) && (j==0 || j==n-1))
                    arr[i][j]=c1;
                else if((i>=1 && i<=n-2) && (j>=1 && j<=n-2))
                    arr[i][j]=c3;
                else
                    arr[i][j]=c2;
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        char c1=in.next().charAt(0);
        char c2=in.next().charAt(0);
        char c3=in.next().charAt(0);
        int n=in.nextInt();
        array_pattern.print(c1, c2, c3, n);
    }
}
