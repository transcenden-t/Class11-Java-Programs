//to check if a the sum of the number's factors inlcuding 1 and excluding itself is equal to the original number
import java.util.*;
public class random_wap03
{
    public static void main(String []args)
    {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int sum = 0;
        for(int i = 1;i<a;i++)
        {
            if(a%i==0)
                sum = sum + i;
        }
        System.out.println((sum==a) ? "Yes" : "no");
    }
}
