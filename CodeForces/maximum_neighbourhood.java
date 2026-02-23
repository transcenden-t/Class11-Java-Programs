import java.util.*;
public class maximum_neighbourhood
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int tc=in.nextInt();
        while(tc-->0)
        {
            int n=in.nextInt();
            System.out.println((n==1) ? n : (n==2) ? n : Math.max((4*n*n)-n-4 , (5*n*n)-5*n-5));
            // if(n==1) System.out.println(n);
            // if(n==2) System.out.println(9);
            // if(n>2) System.out.println(Math.max((4*n*n)-n-4 , (5*n*n)-5*n-5));
        }
    }
}