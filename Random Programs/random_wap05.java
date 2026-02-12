//to print all prim numbers till the user input range
import java.util.*;
class random_wap05
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int s=0;
        for(int i = 1;i<=n;i++)//iterating till n
        {
            for(int j = 1;j<=i;j++)//finding if the number is prime or not
             {
                if(i%j==0)
                    s++;
            }
            if(s==2)
                    System.out.println(i+"  ");
            s=0;
        }
    }
}